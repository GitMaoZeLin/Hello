package com.tt.data.controller;

import com.tt.data.pojo.User;
import com.tt.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者：mzl
 * @时间：2018/11/19 20:06
 * @描述：用户的控制器
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    //写一个添加user信息的方法，名字叫saveUser()

    @RequestMapping("/saveUser")
    public String saveUser() {
        User user = new User();
        user.setUserName("admin");
        user.setUserPwd("123");
        userService.saveUser(user);
        return "ok";
    }
}
