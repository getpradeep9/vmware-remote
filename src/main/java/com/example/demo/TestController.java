package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private Environment environment;

    @GetMapping("/test")
    String test(){
        System.out.println("came");
        System.out.println(environment);
        System.out.println( environment.getProperty("name") );
        System.out.println(environment.getActiveProfiles());

        Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);

        Arrays.stream(environment.getDefaultProfiles()).forEach(System.out::println);

        System.out.println(environment.getDefaultProfiles().length);

        System.out.println(environment.getActiveProfiles().length);

        System.out.println(environment.getDefaultProfiles());

        return "Hello "+new Date();
    }

}
