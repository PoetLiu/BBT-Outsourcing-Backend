package com.bangdna.main.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestfulEntity<T> {

    @ApiModelProperty(value = "接口调用返回状态， true为正常，false为异常", required = true)
    private Boolean status;

    @ApiModelProperty(value = "用户认证状态，true为已认证，false为未认证", required = true)
    private Boolean auth;

    @ApiModelProperty(value = "接口调用返回编码，0为正常，非0异常。异常时，返回错误码", required = true)
    private int code;

    @ApiModelProperty(value = "调用结果具体信息", required = true)
    private String msg;

    @ApiModelProperty(value = "返回数据", required = true)
    private T data;

    public RestfulEntity(Boolean status, Boolean auth, int code, String msg, T data) {
        this.status = status;
        this.auth   = auth;
        this.code   = code;
        this.msg    = msg;
        this.data    = data;
    }

    public static <T> RestfulEntity<T> getSucess(T data) {
        return new RestfulEntity<>(true, true, 0, "success", data);
    }

    public static <T> RestfulEntity<T> getSucess(String msg, T data) {
        return new RestfulEntity<>(true, true, 0, msg, data);
    }

    public static <T> RestfulEntity<T> getFailure(int code, String msg, T data) {
        return new RestfulEntity<>(false, true, code, msg, data);
    }
}
