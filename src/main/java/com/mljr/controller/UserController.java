package com.mljr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("修改了一些参数...");
        System.out.println("what the fuck!");
        return "haha";
        
    }

    public void run() {
        System.out.println("run方法...");
    }

    public void run() {
        System.out.println("run方法...");
    }
}
