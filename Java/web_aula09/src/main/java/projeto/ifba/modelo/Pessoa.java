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
//@Data
public class Pessoa {
	
	@Id @GeneratedValue
	private int id;
	
	//sem anotação
	private String nome;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}