package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Logic xử lý yêu cầu
@RestController
public class HelloController {
    @Autowired
    private helloworld helloworld;

    @RequestMapping("/")
    public String index() {
        return helloworld.sayHello();
    }
}