package com.springProject_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DoctorClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorClientApplication.class, args);
		System.out.println("doctor client");
	}

}
