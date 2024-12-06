package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	private int id;
	private String marca;
	private String modelo;
	private int ano;
	
	@ManyToOne  //Muitos veiculos podem ter um proprietario
	private Pessoa proprietario;
	
	/*
	 * ManyToOne  -> OneToOne -> Gera a FK na tabela
	 * ManyToMany -> OneToMany -> Gera uma nova tabela
	 */
}
