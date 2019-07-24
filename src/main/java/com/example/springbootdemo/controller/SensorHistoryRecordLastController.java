package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.SensorHistoryRecordLast;
import com.example.springbootdemo.service.SensorHistoryRecordLastService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SensorHistoryRecordLastController {
    @Resource
    private SensorHistoryRecordLastService sensorHistoryRecordLastService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<SensorHistoryRecordLast> findById(){

       return sensorHistoryRecordLastService.findAll();
    }

}
