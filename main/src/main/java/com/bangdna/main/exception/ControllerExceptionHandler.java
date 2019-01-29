package com.bangdna.main.exception;

import com.bangdna.main.common.entity.RestfulEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-29 15:20
 **/

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(CommonException.class)
    public RestfulEntity handleException(CommonException e) {
        return RestfulEntity.getFailure(
                e.getExceptionEnum().getCode(),
                e.getExceptionEnum().getMsg(),
                null);
    }
}
