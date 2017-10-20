package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/10/20.
 * @author 吴峰
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
