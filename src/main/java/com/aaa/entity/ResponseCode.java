package com.aaa.entity;

// 定义常量
public enum ResponseCode {

    // public static final ResponseCode A , // new ResponseCode(code,mag)
    OK(200,"success"),
    ERROR(500,"error"),
    NULL_POINT(501,"空指针"),
    NOT_AUTHENTICATION(401,"未登录"),
    BAD_CREDENTIALS(402,"用户名密码错误"),
    USER_IS_DISABLED(403,"账户被禁用"),
    ACCESS_DENIED(404,"权限不足"),
    AA(1,"a");

    private Integer code;
    private String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
