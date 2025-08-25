package com.sutherland.loanapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sutherland.loanapplication.repo.AadharServiceProxy;
import com.sutherland.loanapplication.repo.CreditScoreServiceProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {CreditScoreServiceProxy.class , AadharServiceProxy.class})
public class LoanApp {
	public static void main(String[] args) {
		SpringApplication.run(LoanApp.class, args);
	}
	@LoadBalanced
	@Bean
	public RestTemplate templte() {
		return new RestTemplate();
	}

}
