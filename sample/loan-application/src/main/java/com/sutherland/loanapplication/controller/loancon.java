package com.sutherland.loanapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sutherland.loanapplication.entity.loan;
import com.sutherland.loanapplication.service.loanser;
@RestController
@RequestMapping("/loans")
public class loancon {
	@Autowired
	loanser service;
	
	@PostMapping
	public ResponseEntity<String> applyLoan(
			@RequestBody loan details) {
		int id = service.applyLoan(details);
		return new ResponseEntity<String>("applied.. id : "+id,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<loan>> findAll() {
		return new ResponseEntity<List<loan>>(service.findAll(),HttpStatus.OK);
	}
	@GetMapping("/status/{loanId}")
	public ResponseEntity<loan> checkLoanStatus(
					@PathVariable int loanId){
		loan details = service.checkLoanStatus(loanId);
		return new ResponseEntity<loan>(details,HttpStatus.OK);
		
	}
	@GetMapping("/verifyloan/{loanId}")
	public ResponseEntity<String> verifyLoan(@PathVariable int loanId){
		String mesg = service.verifyLoan(loanId);
		return new ResponseEntity<String>(mesg,HttpStatus.OK);
	}

}
