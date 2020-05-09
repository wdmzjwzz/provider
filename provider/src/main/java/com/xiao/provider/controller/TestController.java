package com.xiao.provider.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {


    @GetMapping("test_1")
    public Object test_1(String mes){

        return " ";
    }

    @PostMapping("test_3")
    public Object test_3(String mes){

        return " ";
    }
}
