package com.java.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
//@RestController ====  @Controller+@ResponseBody

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "hello,springboot";
    }

}
