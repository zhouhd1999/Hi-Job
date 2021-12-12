package com.zhd.job.server.domain;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:10
 * @email 1255109002@qq.com
 */
public interface Job {
    void run();
    Boolean isFinished();
    Integer getProcess();

}
