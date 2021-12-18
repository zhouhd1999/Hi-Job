package com.zhd.job.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:31
 * @email 1255109002@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
public enum ScheduleType {
    One(0), // 即时任务，立刻执行一次
    Repeat(1),  // 定时间隔, scheduleParam 中的参数单位为秒
    Daily(2),   // 每日, ScheduleParam 格式为：%2d:%2d:%2d
    ;

    private Integer value;
}
