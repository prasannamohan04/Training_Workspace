package com.sutherland.loanapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.loanapplication.entity.loan;
@Repository
public interface Loanrepo extends JpaRepository<loan, Integer> {
	 
}
