package com.example.MovieMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieMicroservicesApplication.class, args);
	}

}
