package com.csrfwork.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

//	@Autowired
//	private QuestionServices questionService; 
//	
	@PostMapping("/account")
	public String saveInformation(){
	
		return "login";
		
	}
	@GetMapping("/account")
	public String sInformation(){
		return "login";
		
	}
}
