package com.zhd.job.server.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author haidongzhou
 * @date 2021/12/11 19:31
 * @email 1255109002@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="JobInfo对象", description="")
public class JonInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务名称")
    private String name;

    @ApiModelProperty(value = "任务类型")
    private String category;

    @ApiModelProperty(value = "任务优先级")
    private Integer priority;

    @ApiModelProperty(value = "任务运行参数")
    private String param;

    @ApiModelProperty(value = "调度方式型")
    private ScheduleType scheduleType = ScheduleType.One;

    @ApiModelProperty(value = "调度参数")
    private String scheduleParam;

    @ApiModelProperty(value = "并发策略")
    private String parallelStrategy;

    @ApiModelProperty(value = "异常重试策略")
    private String retryStrategy;

    @ApiModelProperty(value = "上次触发的时间")
    private Date lastScheduleTime;
}
