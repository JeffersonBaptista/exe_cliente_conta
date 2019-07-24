package com.br.conta.bancaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.conta.bancaria.models.Cliente;
import com.br.conta.bancaria.models.Conta;
import com.br.conta.bancaria.repositories.ClienteRepository;
import com.br.conta.bancaria.repositories.ContaRepopsitory;

@Service
public class ContaService {

	@Autowired
	private ContaRepopsitory contaRepopsitory;

	@Autowired
	private ClienteRepository clienteRepository;

	public Iterable<Conta> exibirTodasContas() {
		return contaRepopsitory.findAll();
	}

	public String salvarConta(Cliente cliente, Conta conta) {

		conta.setCliente(cliente);
		contaRepopsitory.save(conta);

		return "Conta criada com sucesso";

	}

	public long totalContas() {
		return contaRepopsitory.count();
	}

	public void salvarContaApiRest(Conta conta) {
		contaRepopsitory.save(conta);
	}
	
	
	
	 public void atualizarContaApiRest(int id,Conta conta) {
		 conta.setId(id);
		 contaRepopsitory.save(conta);
		 
	 }
	 public void cancelarContaApiRest(int id) {
		 contaRepopsitory.deleteById(id);
		 
	 }
	 
	 public Conta pegarContaIdApiRest(int id) {
		 
		 if(contaRepopsitory.existsById(id)) {
		 return contaRepopsitory.findById(id).get();
		 }
		 return null;
	 }

}
