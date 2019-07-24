package com.example.springbootdemo.pojo;

import java.util.Date;

public class SensorHistoryRecordLast {
    private Long id;

    private Long paramId;

    private String hisValue;

    private Date updateTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public String getHisValue() {
        return hisValue;
    }

    public void setHisValue(String hisValue) {
        this.hisValue = hisValue == null ? null : hisValue.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}