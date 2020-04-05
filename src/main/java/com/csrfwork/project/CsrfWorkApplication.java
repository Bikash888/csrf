package com.csrfwork.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CsrfWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsrfWorkApplication.class, args);
	}

}
