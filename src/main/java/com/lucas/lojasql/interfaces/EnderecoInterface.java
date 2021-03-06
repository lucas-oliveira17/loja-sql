package com.lucas.lojasql.interfaces;

import java.util.List;

import com.lucas.lojasql.entities.Endereco;

public interface EnderecoInterface {

	List<Endereco> findAll();
	
	Endereco findById(Integer id);
	
	Endereco findByCep(String cep);
	
	void insert(Endereco endereco);
	
	void update(Endereco endereco);
	
	void deleteById(Integer id);
}
