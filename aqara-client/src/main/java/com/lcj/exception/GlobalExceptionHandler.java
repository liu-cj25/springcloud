package com.lcj.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常
 *
 * @author changjiang.liu
 * @date 2022/3/28 17:13
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String handleException(Exception e, HttpServletRequest request) {
        logger.warn("请求url:[{}]出错", request.getRequestURL(), e);
        return e.getMessage();
    }
}
