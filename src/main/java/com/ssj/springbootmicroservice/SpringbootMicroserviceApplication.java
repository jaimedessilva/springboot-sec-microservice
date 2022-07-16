package com.ssj.springbootmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ssj.springbootmicroservice.controller"})
public class SpringbootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceApplication.class, args);
	}
}
