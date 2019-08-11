package com.linwei.exception;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MyException create(String message, Object param, Throwable cause) {
        log.error("异常的概要：" + message + "参数信息：" + JSON.toJSONString(param), cause);
        return new MyException(message);
    }

    public MyException create(String message) {
        log.error("异常的概要：" + message);
        return new MyException(message);
    }
}
