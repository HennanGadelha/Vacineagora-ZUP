package com.vacineagora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vacineagora.dao.UsuarioDao;
import com.vacineagora.domain.Usuario;

@Service @Transactional(readOnly = false)
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public void salvar(Usuario usuario) {
		usuarioDao.save(usuario);
		
	}

	@Override
	public void editar(Usuario usuario) {
		
		usuarioDao.update(usuario);
		
	}

	@Override
	public void excluir(Long id) {
		
		usuarioDao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Usuario buscarUsuarioId(Long id) {
		
		return usuarioDao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Usuario> buscarTodos() {
		
		return usuarioDao.findAll();
	}

}
