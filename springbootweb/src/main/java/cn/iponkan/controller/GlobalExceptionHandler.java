package cn.iponkan.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody // 拦截返回是 json返回结果
    public Map<String, Object> exceptionHandler() {
        Map<String, Object> result=new HashMap<String, Object>();
        result.put("code","500");
        result.put("msg","亲,系统错误,请稍后重试....");
        return result;
    }
}
