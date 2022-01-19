package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/test")
    String test(){
        System.out.println("came");
        return "Hello "+new Date();
    }

}
