package com.example.springbootdemo.controller;


import com.example.springbootdemo.pojo.Goods;
import com.example.springbootdemo.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger LOGO = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Goods> findAll() {

        List<Goods> goodsList = goodsService.findAll();

        return goodsList;
    }

}
