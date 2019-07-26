package com.example.springbootdemo.dao;

import com.example.springbootdemo.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //查询所有商品信息
    List<Goods> findAll();

    //根据条件查询商品信息（名称<模糊查询>、类别、价格<区间>等）
    List<Goods> selectGoods(Goods goods);

}