package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.constant.StringEnum;
import com.example.springbootdemo.pojo.ShoppingCar;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void intoShoppingCar(ShoppingCar shoppingCar) {

        //获取用户信息
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        User userInfo= (User) session.getAttribute(StringEnum.USERINFO.getMsg());
        //以用户信息为key，把购物车中的商品信息存入Redis
        Map<String, Object> map = new HashMap<>();



        redisTemplate.opsForHash().putAll(userInfo.getUsername(),map);

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
