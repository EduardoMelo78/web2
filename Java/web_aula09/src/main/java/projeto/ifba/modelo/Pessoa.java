package projeto.ifba.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 	@ManyToMany //gera tabela nova
	@OneToMany  //gera tabela nova
	@ManyToOne  //gera uma foreign key do atributo declarado -> Por exemplo a fk de veiculo vem para Pessoa
	@OneToOne   //gera uma foreign key
*/



@Entity
@Data
public class Pessoa {
	
	@Id @GeneratedValue
	private int id;
	
	//sem anotação
	private String nome;
	private String email;
	
	
}