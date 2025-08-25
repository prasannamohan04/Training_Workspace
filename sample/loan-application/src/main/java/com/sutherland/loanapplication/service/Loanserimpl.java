package com.sutherland.loanapplication.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sutherland.loanapplication.entity.loan;
import com.sutherland.loanapplication.repo.CreditScoreServiceProxy;
import com.sutherland.loanapplication.repo.Loanrepo;

@Service
public class Loanserimpl implements loanser {

	@Autowired
	Loanrepo repo;
	@Autowired
	RestTemplate template;
	@Autowired
	CreditScoreServiceProxy proxy;
	@Autowired
	CercuitBreakerExample circuitbreak;
	
	@Override
	public int applyLoan(loan details) {
		details.setLoanStatus("APPLIED"); 
 		details.setDateApplied(LocalDate.now()); 
 		details.setDateSanctioned(null); 
		System.out.println(details);
		repo.save(details);
		return details.getLoanId();
	}

	@Override
	public List<loan> findAll() {
		return repo.findAll();
	}

	@Override
	public loan checkLoanStatus(int loanId) {
		Optional<loan> details = repo.findById(loanId);
		return details.get();
	}

	@Override
	public String verifyLoan(int loanId) {
		Optional<loan> optional = repo.findById(loanId);
		loan loandetails = optional.get();
		//String url  = "http://localhost:8182/creditscore/bypancard/" +loandetails.getPanCard();
		//String url = "http://creditscore-service/creditscore/bypancard/"+loandetails.getPanCard();
		//Creditscore score = template.getForObject(url, Creditscore.class);
		//Creditscore score = proxy.getCreditScore(loandetails.getPancard());
		String score =  circuitbreak.getScoreByPancard(loandetails.getPancard());
		System.out.println("from circuit breaker : "+score);
		//loandetails.setCreditScore(score.getScore());
		if(loandetails.getCreditScore()>600) {
			loandetails.setLoanStatus("APPROVED");
			loandetails.setDateSanctioned(LocalDate.now());
		}
		else {
			loandetails.setLoanStatus("REJECTED");
			loandetails.setRemarks("credit score is less then 600");
		}
		System.out.println(loandetails);
		//repo.save(loandetails);
		return "updated";
	}
}
