package com.example.springbootdemo.service;

import java.util.Map;

public interface RedisConfigService {
    //增
    void redisSet(String key, String value);

    //删除
    void redisDelete(String key);

    //查
    Object redisGet(String key);

    //***********************************
    //增 hash
    void redisHSet(String key, Map<String,Object> map);

    //删除  hash
    void redisHDel(String key);

    //查  hash
    String redisHGet(String key,String field);


}
