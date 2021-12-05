package com.zhd.job.server.serice.impl;

/**
 * @author haidongzhou
 * @date 2021/12/5 13:28
 * @email 1255109002@qq.com
 */

import com.zhd.grpc.job.service.HiJobWorkerGrpc;
import com.zhd.job.server.entity.Configuration;
import com.zhd.job.server.serice.HiJobServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@GrpcService
@Slf4j
public class HiJobServiceGrpcImpl extends HiJobWorkerGrpc.HiJobWorkerImplBase implements HiJobServiceGrpc {

    private boolean startTimer;
    private boolean hasFetchLock;
    private Configuration configuration;

    public void init(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean start() {
        if (startTimer) {
            return true;
        }

        // 服务启动时立刻创建一个worker并启动

        // 启动一个定时器，定时获取集群锁，若获取到集群锁则为leader模式，未获取到为LocalClient模式
        startTimer();

        return true;
    }

    private void startTimer() {
        // 定时获取集群锁，若获取到集群锁则为leader模式，未获取到为LocalClient模式
        Runnable FetchClusterLock = () -> {
            String lockName = GetLeaderClusterLockerKey(configuration.getClusterName());

            if (hasFetchLock) {

            }

        };


        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(FetchClusterLock, 0, 2500, TimeUnit.MILLISECONDS);
        this.startTimer = true;
    }

    private String GetLeaderClusterLockerKey(String clusterName) {
        return clusterName + "-job-leader-lock";
    }
}

