package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity	//JPA: ORM criar tabela no banco

public class Pessoa {
	
	@Id 	//notação JPA indica a ORM chave primária (PK)
	@GeneratedValue //JPA: ORM PK será auto-incrementada
	private int id;
	private String nome;
	private String email;
	
	
}

