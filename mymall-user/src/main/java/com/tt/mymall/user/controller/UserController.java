package com.tt.mymall.user.controller;


import com.tt.mymall.user.bean.UmsMember;
import com.tt.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("getAllUsers")
    public List<UmsMember> getAllUsers(){
       List<UmsMember> umsMemberList = userService.getAllUsers();
       return umsMemberList;
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "umsMemberList";
    }
}
