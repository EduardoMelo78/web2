package com.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade2.model.Emprestimo;

@Repository
public interface RepoEmprestimo extends JpaRepository<Emprestimo, Integer> {

}
