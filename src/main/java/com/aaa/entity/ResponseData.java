package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseData implements Serializable {

    private Integer code;   // 接口操作状态码
    private String msg;     // 描述信息
    /*private ResponseCode responseCode;*/
    private Object data;    // 数据

    public static ResponseData ok(Object data) {
        return ResponseData.builder().code(ResponseCode.OK.getCode()).msg("ok").data(data).build();
    }

    public static ResponseData error() {
        return ResponseData.builder().code(ResponseCode.ERROR.getCode()).msg(ResponseCode.ERROR.getMsg()).build();
    }

    public static ResponseData error(String msg) {
        return ResponseData.builder().code(ResponseCode.ERROR.getCode()).msg(msg).build();
    }

    public static ResponseData response(ResponseCode responseCode) {
        return ResponseData.builder().code(responseCode.getCode()).msg(responseCode.getMsg()).build();
    }
}
