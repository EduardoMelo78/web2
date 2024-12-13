package com.atividade1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade1.modelo.Veiculo;

@Repository
public interface RepoVeiculos extends JpaRepository<Veiculo, Integer> {

}
