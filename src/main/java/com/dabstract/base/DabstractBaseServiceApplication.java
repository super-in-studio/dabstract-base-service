package com.dabstract.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DabstractBaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DabstractBaseServiceApplication.class, args);
	}

}
