package com.vacineagora.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vacineagora.domain.Usuario;
import com.vacineagora.service.CadastroAplicacaoService;
import com.vacineagora.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CadastroAplicacaoService cadastroAplicacaoService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario) {
		return "usuario/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "usuario/lista";
	}
	
	
	@PostMapping("/salvar")
	public String salvar(@Valid  Usuario usuario, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "usuario/cadastro";
		}
		
		usuarioService.salvar(usuario);
		attr.addFlashAttribute("success", "Cadastro inserido com sucesso.");
		return "redirect:/usuario/cadastrar";
	}
	
	
}
