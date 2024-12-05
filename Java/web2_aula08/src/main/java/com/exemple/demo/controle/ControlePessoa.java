package com.exemple.demo.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class ControlePessoa {
	
	@PostMapping
	public String save() {
	
		return "POST Add";
	}
	
	
	@GetMapping
	public String findAll() {
		return "GET list";
	}
	
	
	@GetMapping("/{id}")
	public String findById (@PathVariable int id) {
		
		return "GET findById: " + id;
		
	}

}
