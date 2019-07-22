package com.br.conta.bancaria.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Campo Nome é obrigatorio")
	private String nome;
	
	@NotBlank(message = "Campo CPF é obrigatorio")
	private String cpf;
	
	@NotBlank(message = "Campo Telefone é obrigatorio")
	private String telefone;
	
	@OneToOne()	
	private Conta conta;
	
}
