package com.bangdna.main.controller.frontcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bangbangtuan-outsourcing-back-end
 * @author: Abel Lee
 * @create: 2018-12-30 00:54
 **/

@RestController
@RequestMapping("/user")
public class UserController {



    @PostMapping("/register")
    public String register(String username, String password){

        return "注册";
    }

//    @PostMapping("/login")
//    public String login(String username, String password){
//        User user = userService.findUserByUsername(username);
//
////        if (!user.getPassword().equals())
//        return "hello";
//    }


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
