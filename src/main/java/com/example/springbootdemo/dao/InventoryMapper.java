package com.example.springbootdemo.dao;

import com.example.springbootdemo.pojo.Inventory;

public interface InventoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}