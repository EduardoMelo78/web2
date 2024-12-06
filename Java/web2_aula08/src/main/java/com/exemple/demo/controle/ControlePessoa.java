package com.exemple.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Pessoa;
import com.example.demo.repository.RepositorioPessoa;



@RestController
@RequestMapping
public class ControlePessoa {
	
	@Autowired
	RepositorioPessoa repositorio;
	
	/** method:	POST 
	* localhost:8080/pessoa
	* body : json->pessoa
	*/
	@PostMapping
	public Pessoa save(@RequestBody Pessoa pessoa) {
	
		repositorio.save(pessoa);
	}
	
	
	@GetMapping
	public List<Pessoa> findAll() {
		return repositorio.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Pessoa findById (@PathVariable("id") int id) {
		
		return repositorio.findById(id);
		
	}

}
