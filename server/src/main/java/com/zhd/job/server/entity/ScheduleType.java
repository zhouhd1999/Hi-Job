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
    One(0),
    Repeat(1),
    Daily(2),
    ;

    private Integer value;
}
