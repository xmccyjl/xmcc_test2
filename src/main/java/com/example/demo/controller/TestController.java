package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author khaleesi
 * @create 2019-06-20 16:42
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring-boot";
    }
}
