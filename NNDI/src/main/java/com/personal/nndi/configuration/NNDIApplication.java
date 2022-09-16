package com.personal.nndi.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.personal.nndi")
public class NNDIApplication {

	public static void main(String[] args) {
		SpringApplication.run(NNDIApplication.class, args);
	}

}
