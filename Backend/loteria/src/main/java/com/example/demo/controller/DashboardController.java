package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "index";
	}
	
	@PostMapping("/salvausuario")
	public void salvaUsuario() {
		System.out.println("\n\n\n\n\n\n\n usuario salvo");
	}
	
	
}
