package com.example.springbootdemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 工具类
 */
public class CommonUtil {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * redis存string
     */
    public void redisSetString(String key ,String value , Integer timeout){
        //存字符串
        redisTemplate.opsForValue().set(key,value,timeout, TimeUnit.HOURS);

    }

    /**
     * redis取string
     */




    /**
     * redis删string
     */




    /**
     * redis 存hash
     */
    public void redisSetHash(String key, Map<String, Object> map){
        //Redis 存hash
         redisTemplate.opsForHash().putAll(key,map);

    }



    /**
     * redis 取hash
     */




    /**
     * Redis 删除 hash
     */

}
