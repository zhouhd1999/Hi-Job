package com.zhd.job.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haidongzhou
 * @date 2021/12/5 13:59
 * @email 1255109002@qq.com
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {
    private String clusterName;
    private String hostIp;
    private Integer hostPort;
    private Integer workPoolMaxThread = 100;
    private Integer workPoolMinThread = 1;
}
