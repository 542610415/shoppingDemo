package com.example.springbootdemo.constant;

/**
 * 字符串枚举
 */
public enum StringEnum {
    //登录相关

    //用户信息
    USERINFO("userInfo","user");

    private String describe;
    private String msg;

    public String getDescribe() {
        return describe;
    }

    public String getMsg() {
        return msg;
    }

    private StringEnum(String describe,String msg){
        this.describe =describe;
        this.msg = msg;
    }

}
