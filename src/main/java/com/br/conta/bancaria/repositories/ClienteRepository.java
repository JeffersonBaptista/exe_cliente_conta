package com.br.conta.bancaria.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.conta.bancaria.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
