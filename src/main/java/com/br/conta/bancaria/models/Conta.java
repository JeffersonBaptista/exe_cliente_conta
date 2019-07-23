package com.br.conta.bancaria.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

@Entity
public class Conta implements Serializable {
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Campo numero da conta é obrigatorio")
	private String numeroConta;

	@DecimalMin(value = "100", message = "depoisite em sua conta corrente um valor de R$100 reais ou mais para abrir sua conta")
	private double saldoCorrente;

	@DecimalMin(value = "100", message = "depoisite em sua conta poupança um valor de R$100 reais  ou mais para abrir sua conta")
	private double saldoPoupanca;

	@OneToOne(cascade = {CascadeType.ALL})
	private Cliente cliente;

	public Conta() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoCorrente() {
		return saldoCorrente;
	}

	public void setSaldoCorrente(double saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
