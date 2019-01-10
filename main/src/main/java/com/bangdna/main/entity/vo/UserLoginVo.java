package com.bangdna.main.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginVo {
    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank
    private String password;
}
