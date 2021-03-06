package com.zhd.job.server.serice.impl;

/**
 * @author haidongzhou
 * @date 2021/12/5 13:28
 * @email 1255109002@qq.com
 */

import com.zhd.grpc.job.service.HiJobWorkerGrpc;
import com.zhd.job.server.entity.Configuration;
import com.zhd.job.server.serice.HiJobServiceGrpc;
import com.zhd.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@GrpcService
@Slf4j
public class HiJobServiceGrpcImpl extends HiJobWorkerGrpc.HiJobWorkerImplBase implements HiJobServiceGrpc {

    private boolean startTimer;
    private boolean hasFetchLock;
    private Configuration configuration;

    @Autowired
    private RedisUtil redisUtil;

    public void init(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean start() {
        if (startTimer) {
            return true;
        }

        // 服务启动时立刻创建一个worker并启动

        onClusterLockChanged();

        // 启动一个定时器，定时获取集群锁，若获取到集群锁则为主节点，未获取到为从节点
        startTimer();

        return true;
    }

    // 获取集群锁
    private void startTimer() {
        // 定时获取集群锁，若获取到集群锁则为leader模式，未获取到为LocalClient模式
        Runnable FetchClusterLock = () -> {

            String lockName = getLeaderClusterLockerKey(configuration.getClusterName());
            long expireMs = 10 * 1000;
            boolean ret;

            // 如果已经拥有集群锁，更新锁的过期时间
            if (hasFetchLock) {
                ret = redisUtil.expire(lockName, expireMs);
                // 更新失败，尝试重新加锁
                if (!ret) {
                    log.warn("lost cluster lock, try to relock");
                    ret = redisUtil.setAndExpire(lockName, expireMs);
                    // 重新加锁失败，从主节点降级为从节点
                    if (!ret) {
                        log.warn("lost cluster lock, really");
                        hasFetchLock = false;
                        onClusterLockChanged();
                        return;
                    }
                    log.info("get locker again");
                }
            } else {
                // 此时为从节点，没有集群锁，尝试加锁
                ret = redisUtil.setAndExpire(lockName, expireMs);
                // 加锁失败，依旧为从节点
                if (!ret) {
                    return;
                }
                // 加锁成功，升级为主节点
                hasFetchLock = true;
                onClusterLockChanged();
            }
        };


        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(FetchClusterLock, 0, 2500, TimeUnit.MILLISECONDS);
        this.startTimer = true;
    }

    private void onClusterLockChanged() {
        if (hasFetchLock) {
            stopClient();
            startLeader();
        } else {
            startLeader();
            stopClient();
        }
    }

    private Boolean startLeader() {
        log.info("start as leader");
        String leaderKey = getLeaderKey(configuration.getClusterName());

        String host = configuration.getHostIp() + ":" + configuration.getHostPort();
        log.info("leader host is " + host);

        // 设置Redis  key：集群名称 value：ip:port
        redisUtil.set(leaderKey, host);

        // todo

        return true;
    }

    private void stopClient() {
    }


    private String getLeaderClusterLockerKey(String clusterName) {
        return clusterName + "-job-leader-lock";
    }

    private String getLeaderKey(String clusterName)
    {
        return clusterName + "-job-leader";
    }
}

