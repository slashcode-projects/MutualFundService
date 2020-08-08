package com.mfservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MutualFundServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutualFundServiceApplication.class, args);
	}

}
