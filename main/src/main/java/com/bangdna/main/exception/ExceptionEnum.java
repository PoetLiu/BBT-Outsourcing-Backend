package com.bangdna.main.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-29 15:22
 **/

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {


    ;
    /**
     * 异常返回状态码
     */
    private Integer code;

    /**
     * 异常返回消息
     */
    private String msg;
}
