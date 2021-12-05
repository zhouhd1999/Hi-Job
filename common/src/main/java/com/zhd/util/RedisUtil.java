package com.zhd.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author haidongzhou
 * @date 2021/12/5 14:52
 * @email 1255109002@qq.com
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

//    /**
//     * 读取缓存
//     *
//     * @param key
//     * @return
//     */
//    public String get(final String key) {
//        return redisTemplate.opsForValue().get(key);
//    }

    /**
     * 向redis中存放字符串
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {
        try{
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 设置缓存失效时间
     * @param key 键
     * @param time 秒
     * @return
     */
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String get(String key) {
        Object res = redisTemplate.opsForValue().get(key);
        return  res == null ? null : (String)res;
    }

//    /**
//     * 更新缓存
//     */
//    public boolean getAndSet(final String key, String value) {
//        boolean result = false;
//        try {
//            redisTemplate.opsForValue().getAndSet(key, value);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 删除缓存
//     */
//    public boolean delete(final String key) {
//        boolean result = false;
//        try {
//            redisTemplate.delete(key);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
}
