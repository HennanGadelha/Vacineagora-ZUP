package com.vacineagora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vacineagora.dao.CadastroAplicacaoDao;
import com.vacineagora.domain.CadastroAplicacao;


@Service @Transactional(readOnly = false)
public class CadastroAplicacaoServiceImpl implements CadastroAplicacaoService {

	@Autowired
	private CadastroAplicacaoDao aplicacaoDao;
	
	
	@Override
	public void salvar(CadastroAplicacao aplicacao) {
		
		aplicacaoDao.save(aplicacao);
	}

	@Override
	public void editar(CadastroAplicacao aplicacao) {
		
		aplicacaoDao.update(aplicacao);
		
	}

	@Override
	public void excluir(Long id) {
		
		aplicacaoDao.delete(id);
		
	}

	@Override
	public CadastroAplicacao buscarAplicacaoId(Long id) {
		// TODO Auto-generated method stub
		return aplicacaoDao.findById(id);
	}

	@Override
	public List<CadastroAplicacao> buscarTodas() {
		// TODO Auto-generated method stub
		return aplicacaoDao.findAll();
	}

}
