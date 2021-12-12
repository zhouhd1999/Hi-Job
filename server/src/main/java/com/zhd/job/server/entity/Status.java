package com.zhd.job.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:13
 * @email 1255109002@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
public enum Status {
    Pending(1), // 任务已经触发，但未执行
    Doing(2),   // 任务执行中
    Success(3), // 任务执行成功
    Failed(4),  // 任务执行失败
    ;
    private Integer value;

}
