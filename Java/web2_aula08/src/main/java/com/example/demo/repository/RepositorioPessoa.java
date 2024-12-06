package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Pessoa;

public interface RepositorioPessoa extends JpaRepository<Pessoa, Integer>{

}
