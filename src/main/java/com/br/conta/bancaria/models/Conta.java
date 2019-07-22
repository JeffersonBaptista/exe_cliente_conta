package com.br.conta.bancaria.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conta implements Serializable{	
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private double contaCorrente;
	
	
	private double contaPoupanca;
	
	@OneToOne()	
	private Cliente cliente;
	
	
}
