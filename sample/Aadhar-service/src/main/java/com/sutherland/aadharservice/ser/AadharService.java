package com.sutherland.aadharservice.ser;

import java.util.List;

import com.sutherland.aadharservice.entity.AadharDetails;

public interface AadharService {
	AadharDetails getAadharDetailsByAadharNumber(String AadharNum);
	void addDetails(AadharDetails details);
	List<AadharDetails> getAll();
}
