package com.js.enums;

/**
 * @author: 姜爽
 * @date: 2019/12/12 15:16
 * @description: 返回枚举类
 * @version: V1.0
 */
public enum StatusCode {

    Success(0,"操作成功"),
    Fail(-1,"操作失败"),
    InvalidParams(201,"非法的参数!"),
    UserNotLogin(202,"用户没登录"),
    ;

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
