package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.constant.StringEnum;
import com.example.springbootdemo.pojo.ShoppingCar;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.ShoppingCarService;
import com.example.springbootdemo.util.CommonUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

public class ShoppingCarServiceImpl implements ShoppingCarService {


    @Override
    public void intoShoppingCar(ShoppingCar shoppingCar) {

        //获取用户信息
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        User userInfo= (User) session.getAttribute(StringEnum.USERINFO.getMsg());
        //以用户信息为key，把购物车中的商品信息存入Redis


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
