package com.example.business.controller;

import com.example.server.domain.Info;
import com.example.server.domain.User;
import com.example.server.service.InfoService;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-28 19:37
 */
@RestController
public class TestController {
    @Autowired
    private InfoService infoService;
    @Autowired
    private UserService userService;
    @RequestMapping("/infoTest")
    public List<Info> test(){
        return infoService.getAllInfo();
    }

    @RequestMapping("/userTest")
    public List<User> userTest(){
        return userService.getAllInfo();
    }
}
