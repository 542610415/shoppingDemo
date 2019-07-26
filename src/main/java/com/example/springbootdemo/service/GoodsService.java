package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.Goods;

import java.util.List;

public interface GoodsService {

    //查询所有商品信息
    List<Goods> findAll();

    //根据条件查询商品信息（名称<模糊查询>、类别、价格<区间>等）
    List<Goods> selectGoods(Goods goods);

    //添加商品
    int insertGoods(Goods goods);

    //根据ID修改商品信息
    int updateById(Goods goods);

}
