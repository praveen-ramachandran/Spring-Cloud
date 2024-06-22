package com.javatechie.spring.eureaka.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommPaymentServiceApplication.class, args);
	}
}
