package com.example.springbootdemo.pojo;

import java.util.Date;

public class Order {
    private Long id;

    private String orderNumber;

    private String fkUserName;

    private Long fkUserId;

    private Date payTime;

    private Integer totalMoney;

    private Integer status;

    private String buyGoodsInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBuyGoodsInfo() {
        return buyGoodsInfo;
    }

    public void setBuyGoodsInfo(String buyGoodsInfo) {
        this.buyGoodsInfo = buyGoodsInfo == null ? null : buyGoodsInfo.trim();
    }
}