package com.sutherland.aadharservice.controller;

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

import com.sutherland.aadharservice.entity.AadharDetails;
import com.sutherland.aadharservice.ser.AadharService;

@RestController
@RequestMapping("/aadhar")
public class AadharController {
	@Autowired
	AadharService service;
	
	@PostMapping
	public ResponseEntity<String> addDetails(@RequestBody AadharDetails details){
		service.addDetails(details);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<AadharDetails>> getAll(){
		List<AadharDetails> list = service.getAll();
		return new ResponseEntity<List<AadharDetails>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/byaadharnum/{AadharNum}")
	public ResponseEntity<AadharDetails> getAadharDetailsByAadharNumber(@PathVariable String AadharNum){
		AadharDetails details = service.getAadharDetailsByAadharNumber(AadharNum);
		return new ResponseEntity<AadharDetails>(details,HttpStatus.OK);
	}

}
