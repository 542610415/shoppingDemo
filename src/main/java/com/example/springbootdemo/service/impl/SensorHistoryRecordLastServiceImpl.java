package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.SensorHistoryRecordLastMapper;
import com.example.springbootdemo.pojo.SensorHistoryRecordLast;
import com.example.springbootdemo.service.SensorHistoryRecordLastService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SensorHistoryRecordLastServiceImpl implements SensorHistoryRecordLastService {
    @Resource
    private SensorHistoryRecordLastMapper sensorHistoryRecordLastMapper;


    @Override
    public List<SensorHistoryRecordLast> findAll() {
        return sensorHistoryRecordLastMapper.findAll();
    }
}
