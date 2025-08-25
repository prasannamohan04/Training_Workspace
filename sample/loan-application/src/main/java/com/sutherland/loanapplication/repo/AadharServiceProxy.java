package com.sutherland.loanapplication.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sutherland.loanapplication.dto.AadharDetails;

@FeignClient(name = "aadhar-service")
public interface AadharServiceProxy {
	@GetMapping(value = "/aadhar/byaadharnum/{AadharNum}")
	AadharDetails getAadharDetails(@PathVariable String AadharNum);
}
