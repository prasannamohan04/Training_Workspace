package com.sutherland.loanapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sutherland.loanapplication.dto.Creditscore;
import com.sutherland.loanapplication.repo.CreditScoreServiceProxy;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Component
public class CercuitBreakerExample {
	@Autowired
	CreditScoreServiceProxy proxy;
	
	@CircuitBreaker(name = "creditscore-service", fallbackMethod = "getScoreByPancardFallback")
	public String getScoreByPancard(String pancard) {
		Creditscore score =proxy.getCreditScore(pancard);
		return score.toString();
	}
	
	public String getScoreByPancardFallback(String pancard, Exception ex) {
		String str = "credit score service is down at present.... unable to fetch";
		return str+ex.getMessage();
	}
}
