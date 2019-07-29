package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.ShoppingCar;

import java.util.List;

public interface ShoppingCarService {

    /**
     * 加入购物车
     */
    void intoShoppingCar (ShoppingCar shoppingCar);

    /**
     * 删除购物车中商品信息
     */
    void deleteShoppingCar (Integer goodsId);

    /**
     * 查询购物车中的商品信息
     */
    List<ShoppingCar> findAllIntoShoppingCar();

}
