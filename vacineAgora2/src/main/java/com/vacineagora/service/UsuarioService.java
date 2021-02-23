package com.vacineagora.service;

import java.util.List;

import com.vacineagora.domain.Usuario;

public interface UsuarioService {

	void salvar (Usuario usuario);
	
	void editar (Usuario usuario);
	
	void excluir (Long id);
	
	Usuario buscarUsuarioId(Long id);
	
	List<Usuario> buscarTodos();
	
}
