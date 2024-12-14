package com.casa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Pessoa {
	private long id;
	private String nome;
	private String email;
	
}
