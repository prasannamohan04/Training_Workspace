package com.sutherland.loanapplication.service;

import java.util.List;

import com.sutherland.loanapplication.entity.loan;

public interface loanser {
	int applyLoan(loan details);
    List<loan> findAll();
    loan checkLoanStatus(int loanId);
    String verifyLoan(int loanId);

}
