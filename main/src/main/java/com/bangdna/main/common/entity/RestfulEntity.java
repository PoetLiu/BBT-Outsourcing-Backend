package com.bangdna.main.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestfulEntity<T> {

    @ApiModelProperty(value = "返回状态", required = true, notes = "接口调用返回状态， true为正常，false为异常")
    private Boolean status;

    @ApiModelProperty(value = "用户是否认证", required = true, notes = "用户认证状态，true为已认证，false为未认证")
    private Boolean auth;

    @ApiModelProperty(value = "接口调用返回码", required = true, notes = "接口调用返回编码，0为正常，非0异常。异常时，返回错误码")
    private int code;

    @ApiModelProperty(value = "接口调用结果提示信息", required = true, notes = "调用结果具体信息")
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
