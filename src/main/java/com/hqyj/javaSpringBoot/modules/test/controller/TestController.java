package com.hqyj.javaSpringBoot.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author  Jayoung
 * createDate  2020/8/10 0010 10:40
 * version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /*
    * 127.0.0.1:8080/test/testDesc   ----get
    * */
    @GetMapping("/testDesc")
    @ResponseBody
    public String testDesc(){
        return "This is test module desc.";
    }
}
