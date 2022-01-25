package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class VerifyController {

    @GetMapping("/verify")
    String verifyEndpoint(){
        return new Date().toString();
    }
}
