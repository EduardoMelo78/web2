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

import com.atividade2.model.Livro;
import com.atividade2.model.Usuario;
import com.atividade2.repository.RepoUsuario;

@RestController
@RequestMapping("/usuario")
public class ControleUsuario {
	
	@Autowired
	RepoUsuario repo;
	
	@PostMapping           //METHOD:post, URL: localhosto:8080/pessoa, Body: Pessoa (JSON)
	public String inserir(@RequestBody Usuario usu) {
		repo.save(usu);
		return "Usuario salvo com sucesso";
		//save
	}
	
	@GetMapping
	public List<Usuario> listar() {
		
		//findAll
		return repo.findAll();
	}
	
	@GetMapping("/{id}") 	//GET, localhost:8080/pessoa/ID
	public Optional<Usuario> localizarPorId(@PathVariable ("id") int id) {
		
		//findAll
		return repo.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable ("id") int id) {
		repo.deleteById(id);
		return "Usuario de id: "+ id +" deletado com sucesso";
	}
	

}
