package com.example.springbootdemo.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 购物车
 */
@Getter
@Setter
public class ShoppingCar {

    //商品ID
    private Long goodsId;

    //商品名称
    private String goodsName;

    //购买数量
    private Integer number;

    //单价
    private Double price;

    //商品状态（0-已删除；1-正常； 用来模拟软删除）
    private Integer status;

}
