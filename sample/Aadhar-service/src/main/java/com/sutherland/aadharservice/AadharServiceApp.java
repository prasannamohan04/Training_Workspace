package com.sutherland.aadharservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AadharServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(AadharServiceApp.class, args);
	}

}
