package com.sutherland.aadharservice.ser;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.aadharservice.entity.AadharDetails;
import com.sutherland.aadharservice.repository.AadharRepo;

@Service
public class AadharServiceImplementation implements AadharService {
	@Autowired
	AadharRepo repo;
	
	@Override
	public void addDetails(AadharDetails details) {
		repo.save(details);
	}

	@Override
	public List<AadharDetails> getAll() {
		return repo.findAll();
	}

	@Override
	public AadharDetails getAadharDetailsByAadharNumber(String AadharNum) {
		Optional<AadharDetails> details = repo.findById(AadharNum);
		return details.get();
	}
}
