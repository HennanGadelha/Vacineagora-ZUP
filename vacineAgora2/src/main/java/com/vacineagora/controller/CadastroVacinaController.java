package com.vacineagora.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vacineagora.domain.CadastroAplicacao;
import com.vacineagora.service.CadastroAplicacaoService;

@Controller
@RequestMapping("/cadastroAplicacao")
public class CadastroVacinaController {

	@Autowired
	private CadastroAplicacaoService cadastroAplicacaoService;
	
	ResponseEntity responseEntity;
	
	@GetMapping("/cadastrar")
	public String cadastrar(CadastroAplicacao cadastro) {
		return "cadastroAplicacao/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "cadastroAplicacao/lista";
	}
	
	
	
	@PostMapping("/salvar")
	public String salvar(@Valid CadastroAplicacao cadastro,  BindingResult result,  RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "cadastroAplicacao/cadastro";
		}
		
		cadastroAplicacaoService.salvar(cadastro);
		//System.out.println(responseEntity.ok().body(cadastro));
		
		attr.addFlashAttribute("success", "Cadastro inserido com sucesso.");
		return "redirect:/cadastroAplicacao/cadastrar";
	}
	
}
