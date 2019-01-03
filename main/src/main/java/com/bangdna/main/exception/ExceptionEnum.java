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

    GROUP_INFO_NOT_FOUND(404, "未查询到团队信息"),

    QUERY_GROUP_MEMBER_BY_ID_IS_EMPTY(404, "通过团队id查询到的成员列表为空")
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
