package com.casa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casa.model.Pessoa;
import com.casa.repositories.RepoPessoa;


@RestController
@RequestMapping("pessoa")
public class PessoaController {

	@Autowired
	RepoPessoa repo;
	
		
		@GetMapping("")
		public String listar() {
			return "listado com sucesso";
		}
		
		@PostMapping("")
		public String inserir(@RequestBody Pessoa p) {
			repo.save(p);
			return "Inserida pessoa: ";
		}
		
		@GetMapping("/{id}")
		public String localizar(@PathVariable int id) {
			return "Localizar pessoa com ID: "+id;
		}
		
		@PutMapping("/{id}")
		public String atualizar() {
			return "Atualizado";
		}
		
		@DeleteMapping("/{id}")
		public String deletar(@PathVariable ("id") int id) {
			repo.deleteById(id);
			return "Pessoa de id: "+ id +" deletado com sucesso";
		}
		
	}

