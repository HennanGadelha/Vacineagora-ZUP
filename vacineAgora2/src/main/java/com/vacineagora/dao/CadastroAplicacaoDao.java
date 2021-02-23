package com.vacineagora.dao;

import java.util.List;

import com.vacineagora.domain.CadastroAplicacao;


public interface CadastroAplicacaoDao {

	void save(CadastroAplicacao cadastro);
	
	void update(CadastroAplicacao cadastro);
	
	void delete(Long id);
	
	CadastroAplicacao findById(Long id);
	
	List<CadastroAplicacao> findAll();
	
	
}
