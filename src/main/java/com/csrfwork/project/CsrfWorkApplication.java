package com.csrfwork.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.csrfwork.project.security.SecurityConfiguration;

@SpringBootApplication
public class CsrfWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsrfWorkApplication.class, args);
	}

}
