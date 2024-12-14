package com.casa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("pessoa")
public class PessoaController {

	@RestController
	@RequestMapping("pessoa") //mapeamento das requisições
	public class TesteAPI {
		
		@GetMapping("")
		public String listar() {
			return "listado com sucesso";
		}
		

		@PostMapping("")
		public String inserir() {
			return "Inserir..";
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
		public String deletar() {
			return "Deletado";
		}
	}
}
