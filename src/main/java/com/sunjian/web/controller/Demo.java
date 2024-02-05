package com.sunjian.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bizRecordApi")
public class Demo {

    @GetMapping("test")
    public String test(){
        return "hello，你好呀！";

    }

}

