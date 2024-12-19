package com.atividade2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade2.model.Livro;
import com.atividade2.repository.RepoLivro;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("livro")
public class ControleLivro {

		@Autowired
		RepoLivro repoLivro;
		
		@PostMapping
		public String inserir(@RequestBody Livro l) {
			repoLivro.save(l);
			return "Livro salvo com sucesso";
			
			
			//save
		}
		
		@GetMapping
		public List<Livro> listar() {
			
			//findAll
			return repoLivro.findAll();
		}
		
		@GetMapping("/{id}") 	//GET, localhost:8080/pessoa/ID
		public Optional<Livro> localizarPorId(@PathVariable ("id") int id) {
			
			//findAll
			return repoLivro.findById(id);
		}
		
		@DeleteMapping("/{id}")
		public String deletar(@PathVariable ("id") int id) {
			repoLivro.deleteById(id);
			return "Livro de id: "+ id +" deletado com sucesso";
		}
		
		
		
		
}
