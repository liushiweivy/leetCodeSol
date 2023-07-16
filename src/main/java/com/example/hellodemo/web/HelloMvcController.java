package com.example.hellodemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMvcController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}

