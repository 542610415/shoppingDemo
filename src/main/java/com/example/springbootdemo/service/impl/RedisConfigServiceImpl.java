package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.service.RedisConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Map;

public class RedisConfigServiceImpl implements RedisConfigService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void redisSet(String key, String value) {

        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set(key, value);
    }

    @Override
    public void redisDelete(String key) {

        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.getOperations().delete(key);
    }


    @Override
    public Object redisGet(String key) {

        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object val = valueOperations.get(key);
        return val == null ? null : val;
    }

    @Override
    public void redisHSet(String key, Map<String, Object> map) {

        HashOperations hashOperations = redisTemplate.opsForHash();

        hashOperations.putAll(key, map);
    }

    @Override
    public void redisHDel(String key) {

        HashOperations hashOperations = redisTemplate.opsForHash();

        hashOperations.delete(key);
    }


    @Override
    public String redisHGet(String key, String field) {

        HashOperations hashOperations = redisTemplate.opsForHash();

        Object val = hashOperations.get(key, field);

        return val == null ? null : val.toString();
    }
}
