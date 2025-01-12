package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @RequestMapping(value = "/")
    public String index() {
        return "Hello world";
    }

}
