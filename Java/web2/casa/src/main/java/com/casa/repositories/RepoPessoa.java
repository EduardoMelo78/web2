package com.casa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.model.Pessoa;

public interface RepoPessoa extends JpaRepository<Pessoa, Integer> {

}
