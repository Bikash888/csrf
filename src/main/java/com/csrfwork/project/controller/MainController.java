package com.csrfwork.project.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@PostMapping("/account")
	public String saveInformation(){
	
		return "success";
		
	}
	@PostMapping("/tst")
	public String normation(){

		return "success";
		
	}
	@GetMapping("/")
	public String sInformation(){
		return "login";
	}
	
}
