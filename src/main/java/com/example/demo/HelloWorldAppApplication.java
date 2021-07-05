package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HelloWorldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppApplication.class, args);
	}
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello From MK!!!";
	}
}
