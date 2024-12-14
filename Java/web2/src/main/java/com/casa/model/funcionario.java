package com.casa.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class funcionario extends Pessoa {
	
	private String cargo;
	private Date admissao;
	
}
