package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.constant.StringEnum;
import com.example.springbootdemo.pojo.ShoppingCar;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.RedisConfigService;
import com.example.springbootdemo.service.ShoppingCarService;
import com.example.springbootdemo.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Map;

public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisConfigService redisConfigService;


    @Override
    public void intoShoppingCar(ShoppingCar shoppingCar) {

        //获取用户信息
        User userInfo= (User) CommonUtil.getSessionValue(StringEnum.USERINFO.getMsg());

        //查看Redis中有没有该用户的购物车的记录


        //把用户信息转成map
        Map<String, Object> map = CommonUtil.entityToMap(userInfo);

        //以用户信息为key，把购物车中的商品信息存入Redis
        redisConfigService.redisHSet(userInfo.getUsername(),map);

    }

    @Override
    public void deleteShoppingCar(Integer goodsId) {

        //根据KEY值（用户信息）删除购物车（Redis）中的商品信息


    }

    @Override
    public List<ShoppingCar> findAllIntoShoppingCar() {

        //根据KEY值（用户信息）查询购物车（Redis）中的商品信息


        return null;
    }
}
