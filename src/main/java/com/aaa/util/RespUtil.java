package com.aaa.util;

import com.aaa.entity.ResponseCode;
import com.aaa.entity.ResponseData;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RespUtil {

    public static void setRespData(HttpServletResponse response,ResponseCode responseCode) throws IOException{
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(ResponseData.response(responseCode)));
        writer.flush();
        writer.close();
    }
}
