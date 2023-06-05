package com.aaa.exception;

import com.aaa.entity.ResponseCode;
import com.aaa.entity.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// controller通知
@ControllerAdvice
public class GlobalExceptionHandler {

    // 异常处理器
    @ExceptionHandler(value = ArithmeticException.class)
    @ResponseBody
    public ResponseData arithmeticError(ArithmeticException e) {
        return ResponseData.error("计算错误");
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResponseData nullPointerError() {
        return ResponseData.response(ResponseCode.NULL_POINT);
    }

    /*@ExceptionHandler(value = Exception.class)
    @ResponseBody*/
    public ResponseData error() {
        return ResponseData.error("系统错误");
    }

}
