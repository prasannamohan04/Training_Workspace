package com.sutherland.loanapplication.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sutherland.loanapplication.dto.Creditscore;

@FeignClient(name = "creditscore-service")
public interface CreditScoreServiceProxy {
	@GetMapping(value = "/creditscoreapp/creditscore/bypancard/{pancard}")
	Creditscore getCreditScore(@PathVariable String pancard);
}
