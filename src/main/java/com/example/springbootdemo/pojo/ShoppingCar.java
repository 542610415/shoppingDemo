package com.example.springbootdemo.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 购物车
 */
@Getter
@Setter
public class ShoppingCar {

    //商品信息（商品ID，商品名称，数量，单价）
    private Long goodsId;
    private String goodsName;
    private Integer number;
    private Double price;

}
