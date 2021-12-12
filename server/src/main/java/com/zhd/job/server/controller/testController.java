package com.zhd.job.server.controller;

import com.zhd.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author haidongzhou
 * @date 2021/12/5 16:24
 * @email 1255109002@qq.com
 */
@RestController
public class testController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public String getSchedule() {
        redisUtil.setAndExpire("time", 10);
        return redisUtil.get("time");
    }
}
