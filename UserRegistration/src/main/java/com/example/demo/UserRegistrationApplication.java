package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRegistrationApplication {
//this is from portal 11
	//this is second test
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

}
