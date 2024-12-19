package com.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade2.model.Livro;

public interface RepoLivro extends JpaRepository<Livro, Integer>{

}
