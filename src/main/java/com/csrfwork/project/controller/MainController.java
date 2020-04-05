package com.csrfwork.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.csrfwork.project.model.Questions;
import com.csrfwork.project.service.QuestionServices;

@Controller
public class MainController {

	@Autowired
	private QuestionServices questionService; 
	
	@PostMapping("/account")
	public String saveInformation(Questions questions){
		questionService.saveQuestions(questions);
		return "login";
		
	}
	@GetMapping("/account")
	public String sInformation(Questions questions){
		return "login";
		
	}
}
