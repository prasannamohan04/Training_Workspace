package com.sutherland.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class sampleController {
	@GetMapping
	public String welcome() {
		return "Welcome to spring boot" ;
	}
	@GetMapping("/getreq")
	public String anotherGet() {
		return "another get request";
	}
	@PutMapping
	public String postExample() {
		return "put req ";
	}
	@PostMapping
	public String putExample() {
		return "put req ";
	}
	@DeleteMapping
	public String delExample() {
		return "del req ";
	}
}
