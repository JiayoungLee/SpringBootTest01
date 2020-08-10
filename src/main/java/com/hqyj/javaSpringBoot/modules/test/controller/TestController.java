package com.hqyj.javaSpringBoot.modules.test.controller;

import com.hqyj.javaSpringBoot.modules.test.vo.ApplicationTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Value("${server.port}")
    private int port;
    @Value("${com.name}")
    private String name;
    @Value("${com.age}")
    private int age;
    @Value("${com.desc}")
    private String desc;
    @Value("${com.random}")
    private String random;

    @Autowired
    private ApplicationTest applicationTest;

    /*
     * http://localhost:8085/test/logTest   ----get
     * */
    @GetMapping("/logTest")
    @ResponseBody
    public String logTest(){
        LOGGER.trace("This is trace log");
        LOGGER.debug("This is debug log");
        LOGGER.info("This is info log");
        LOGGER.warn("This is warn log");
        LOGGER.error("This is error log");

        return "This is log test";
    }


    /*
     * http://localhost:8085/test/testProperties   ----get
     * */
    @GetMapping("testProperties")
    @ResponseBody
    public String testProperties(){
        StringBuffer sb = new StringBuffer();

        return sb.append(age).append("---").append(name).append("---")
                .append(desc).append("---").append(random).append("<br>")
                .append(applicationTest.getName()).append("---").append(applicationTest.getAge()).append("---")
                .append(applicationTest.getDesc()).append("---").append(applicationTest.getRandom()).toString();
    }




    /*
    * 127.0.0.1:8085/test/testDesc   ----get
    * */
    @GetMapping("/testDesc")
    @ResponseBody
    public String testDesc(){
        return "This is test module desc.";
    }
}
