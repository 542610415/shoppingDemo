package com.example.springbootdemo.pojo;

import java.util.Date;

public class Inventory {
    private Long id;

    private String fkGoodsName;

    private Long fkGoodsId;

    private String fkUserName;

    private Long fkUserId;

    private Integer number;

    private Date intoTime;

    private Date outTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFkGoodsName() {
        return fkGoodsName;
    }

    public void setFkGoodsName(String fkGoodsName) {
        this.fkGoodsName = fkGoodsName == null ? null : fkGoodsName.trim();
    }

    public Long getFkGoodsId() {
        return fkGoodsId;
    }

    public void setFkGoodsId(Long fkGoodsId) {
        this.fkGoodsId = fkGoodsId;
    }

    public String getFkUserName() {
        return fkUserName;
    }

    public void setFkUserName(String fkUserName) {
        this.fkUserName = fkUserName == null ? null : fkUserName.trim();
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getIntoTime() {
        return intoTime;
    }

    public void setIntoTime(Date intoTime) {
        this.intoTime = intoTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
}