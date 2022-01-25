package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("came here ONE");
		System.out.println("here_to ONE"  );
		SpringApplication.run(DemoApplication.class, args);
	}

}
