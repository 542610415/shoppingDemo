package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.GoodsMapper;
import com.example.springbootdemo.pojo.Goods;
import com.example.springbootdemo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;


    @Override
    public List<Goods> findAll() {
        List<Goods> goodsList=goodsMapper.findAll();
        if(goodsList.size()==0){//没有商品
            return null;
        }
        return goodsList;
    }

    @Override
    public List<Goods> selectGoods(Goods goods) {
        return null;
    }

    @Override
    public int insertGoods(Goods goods) {
        return 0;
    }

    @Override
    public int updateById(Goods goods) {
        return 0;
    }
}
