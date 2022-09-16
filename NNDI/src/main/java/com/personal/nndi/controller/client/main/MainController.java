package com.personal.nndi.controller.client.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/NNDI")
	public String MainPage(Model model) {
		System.out.println("TEST");
		return "main/main"; 
		
	}
}
