package com.vacineagora.dao;

import java.util.List;

import com.vacineagora.domain.Usuario;

public interface UsuarioDao {
	
	void save(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(Long id);
	
	Usuario findById(Long id);
	
	List<Usuario> findAll();
	
	

}
