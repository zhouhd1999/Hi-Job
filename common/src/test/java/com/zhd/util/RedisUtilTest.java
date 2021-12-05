package com.zhd.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author haidongzhou
 * @date 2021/12/5 14:55
 * @email 1255109002@qq.com
 */
@SpringBootTest(classes = {RedisUtil.class})
@RunWith(SpringRunner.class)
public class RedisUtilTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void setKey() {
        redisUtil.set("hello", "123");
    }
}
