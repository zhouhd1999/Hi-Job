package com.zhd.job.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:31
 * @email 1255109002@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JonInfo {
    private Integer id; // 任务ID
    private String name;    // 任务名称
    private String category;    // 任务类型
    private Integer priority;   // 任务优先级
    private ScheduleType scheduleType = ScheduleType.One;   // 调度方式
    private String scheduleParam;   // 调度参数
    private String param;   // 任务运行参数
    private String parallelStrategy;    // 并发策略
    private String retryStrategy;   // 异常重试策略
    private Date lastScheduleTime;  // 记录下上次触发的时间
}
