package projeto.ifba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.ifba.modelo.Pessoa;


@Repository
public interface RepositorioPessoa extends JpaRepository<Pessoa, Integer>{

}
