package com.zhd.job.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:27
 * @email 1255109002@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRunParam {
    private String id;
    private String jobId;
    private String category;
    private String param;
}
