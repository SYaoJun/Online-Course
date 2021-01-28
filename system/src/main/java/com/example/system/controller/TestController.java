package com.example.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaojun
 * @create 2021-01-28 19:37
 */
@RestController
public class TestController {

    @RequestMapping("/success")
    public String test(){
        return "success";
    }
}
