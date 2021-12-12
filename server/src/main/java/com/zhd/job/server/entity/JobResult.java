package com.zhd.job.server.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:13
 * @email 1255109002@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResult {
    private String id;
    private String jobId;
    private Status status = Status.Pending;
    private String result;
    private Long startTime = 0L;
    private Long finishedTime = 0L;
    private Integer failedCount = 0;    // 任务执行失败的次数
    private String workerId;    // 执行任务的服务
    private Long healthReportTime = 0L;
    private Integer dispatchFailedTime = 0;
}
