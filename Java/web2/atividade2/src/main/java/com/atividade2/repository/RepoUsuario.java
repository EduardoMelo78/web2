package com.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade2.model.Usuario;

@Repository
public interface RepoUsuario extends JpaRepository<Usuario, Integer>{

}
