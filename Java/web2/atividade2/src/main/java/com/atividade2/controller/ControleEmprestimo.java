package com.atividade2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade2.model.Emprestimo;
import com.atividade2.repository.RepoEmprestimo;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/emprestimo")
public class ControleEmprestimo {

		@Autowired
		RepoEmprestimo repo;
		
		@GetMapping
		public List<Emprestimo> listar() {
			
			return  repo.findAll();
		}
		
		@PostMapping
		public String salvar (@RequestBody Emprestimo e) {
			repo.save(e);
			return "Salvo Emprestimo com sucesso";
		}
		
		@GetMapping("/{id}")
		public Optional<Emprestimo> buscarPorId(@PathVariable ("id") int id) {
			return repo.findById(id);
		}
		
		@DeleteMapping("/{id}")
		public String deletar(@PathVariable ("id") int id) {
			repo.deleteById(id);
			return "Deletado Emprestimo com sucesso";
			
		}
		
		
}
