package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastrarController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "register";
	}
}
