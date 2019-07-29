package com.example.springbootdemo.controller;


import com.example.springbootdemo.pojo.Goods;
import com.example.springbootdemo.pojo.ResultBack;
import com.example.springbootdemo.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger LOGO = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;

    /**
     * 查询所有商品
     * @return
     */
    @GetMapping("/findAll")
    @ResponseBody
    public ResultBack findAll() {

        List<Goods> goodsList = goodsService.findAll();

        ResultBack resultBack = new ResultBack();
        resultBack.setData(goodsList);

        return resultBack;
    }

    /**
     * 根据条件查询商品
     * @return
     */
    @PostMapping("/select")
    @ResponseBody
    public ResultBack selectGoods(@RequestBody Goods goods){

        List<Goods> goodsList=goodsService.selectGoods(goods);

        ResultBack resultBack = new ResultBack();
        resultBack.setData(goodsList);

        return resultBack;
    }

}
