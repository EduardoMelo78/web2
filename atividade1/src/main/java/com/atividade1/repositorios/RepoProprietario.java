package com.atividade1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade1.modelo.Proprietario;

@Repository
public interface RepoProprietario extends JpaRepository<Proprietario, Integer>{

}
