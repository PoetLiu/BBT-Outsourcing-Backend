package com.bangdna.main.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-29 15:20
 **/

@ControllerAdvice
public class ControllerExceptionHander {

    @ExceptionHandler(CommonException.class)
    public ResponseEntity<ExceptionResult> handleException(CommonException e){


        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
