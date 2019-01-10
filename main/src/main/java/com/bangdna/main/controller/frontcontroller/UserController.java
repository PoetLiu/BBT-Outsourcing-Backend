package com.bangdna.main.controller.frontcontroller;

import com.bangdna.main.entity.vo.UserLoginVo;
import com.bangdna.main.entity.vo.UserRegisterVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String login(HttpServletRequest request,
                        @RequestBody @Valid UserLoginVo vo){
       // User user = userService.findUserByUsername(username);
        HttpSession session = request.getSession();
        session.setAttribute("user", vo);
        //if (!user.getPassword().equals())
        return "ok";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
