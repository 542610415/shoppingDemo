package com.example.springbootdemo.dao;

import com.example.springbootdemo.pojo.SensorHistoryRecordLast;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SensorHistoryRecordLastMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SensorHistoryRecordLast record);

    int insertSelective(SensorHistoryRecordLast record);

    SensorHistoryRecordLast selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SensorHistoryRecordLast record);

    int updateByPrimaryKey(SensorHistoryRecordLast record);

    //*************
    List<SensorHistoryRecordLast> findAll();


}