package com.vacineagora.service;

import java.util.List;

import com.vacineagora.domain.CadastroAplicacao;

public interface CadastroAplicacaoService {

	void salvar (CadastroAplicacao aplicacao);
	
	void editar (CadastroAplicacao aplicacao);
	
	void excluir (Long id);
	
	CadastroAplicacao buscarAplicacaoId(Long id);
	
	List<CadastroAplicacao> buscarTodas();
	
}
