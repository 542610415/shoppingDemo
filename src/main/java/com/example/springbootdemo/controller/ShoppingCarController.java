package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.ShoppingCar;
import com.example.springbootdemo.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 购物车
 */
@Controller
@RequestMapping("/shoppingCar")
public class ShoppingCarController {

    @Autowired
    private ShoppingCarService shoppingCarService;

    /**
     * 加入购物车
     */
    @PostMapping("/intoShoppingCar")
    @ResponseBody
    public void intoShoppingCar(@RequestBody ShoppingCar shoppingCar) {

        shoppingCarService.intoShoppingCar(shoppingCar);

    }


    /**
     * 删除购物车中商品信息
     */
    @GetMapping("/deleteShoppingCar/{goodsId}")
    @ResponseBody
    public void deleteShoppingCar(@PathVariable Integer goodsId) {

    }


    /**
     * 查询购物车中的商品信息
     */
    @GetMapping("findAll")
    @ResponseBody
    public List<ShoppingCar> findAllIntoShoppingCar() {

        return null;
    }

}
