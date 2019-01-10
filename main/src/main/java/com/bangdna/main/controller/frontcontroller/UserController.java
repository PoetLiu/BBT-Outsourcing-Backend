package com.bangdna.main.controller.frontcontroller;

import com.bangdna.main.entity.vo.UserLoginVo;
import com.bangdna.main.entity.vo.UserRegisterVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-30 00:54
 **/

@RestController
@RequestMapping("/user")
@Api(value = "user", description = "用户接口")
public class UserController {
    @PostMapping("/register")
    @ApiOperation("注册")
    public String register(@RequestBody @Valid UserRegisterVo vo){
        return "注册";
    }

    @PostMapping("/login")
    @ApiOperation("登录")
    public String login(@RequestBody @Valid UserLoginVo vo){
       // User user = userService.findUserByUsername(username);

        //if (!user.getPassword().equals())
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
