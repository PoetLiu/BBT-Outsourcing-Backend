package com.bangdna.main.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-29 15:21
 **/

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommonException extends RuntimeException{

    private ExceptionEnum exceptionEnum;
}
