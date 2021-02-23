package com.vacineagora.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name ="Aplicacao_Vacina")
public class CadastroAplicacao extends AbstractEntity<Long> {
	
	@NotNull(message= "o campo nome da vacina nao pode ser nulo")
	@NotBlank(message = "Informe um nome para a vacina")
	@Size(min = 3, max = 60, message = "O nome da vacina deve ter entre {min} e {max} caracteres.")
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@NotNull(message= "a data de aplicação da vacina nao p ode ser nula")
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_aplicacao", nullable = false)
	private LocalDate dataAplicacao;
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id_fk")
	private Usuario usuario;
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(LocalDate dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	
	
	
}
