package com.br.conta.bancaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.conta.bancaria.models.Cliente;
import com.br.conta.bancaria.models.Conta;
import com.br.conta.bancaria.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Iterable<Cliente> exibirTodos(){
		return clienteRepository.findAll();
	}
	
	
	
	
	
	
	
	

}
