package com.example.bringbring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "cicd 성공~~~!!!!!";
    }
}
