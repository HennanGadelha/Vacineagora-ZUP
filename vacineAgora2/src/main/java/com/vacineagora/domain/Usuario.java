package com.vacineagora.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity<Long> {

	@NotNull(message= "o campo nome do usuario nao pode ser nulo")
	@NotBlank(message = "Informe um nome para o usuario")
	@Size(min = 3, max = 200, message = "O nome do usuario deve ter entre {min} e {max} caracteres.")
	@Column(name = "nome", nullable = false, length = 200)
	private String nome;

	
	@NotNull(message= "o campo email nao pode ser nulo")
	@Email(message = "insira um email valido")
	@NotBlank(message = "Informe um nome")
	@Size(min = 3, max = 60, message = "O nome do usuario deve ter entre {min} e {max} caracteres.")
	@Column(name = "email", nullable = false, unique = true, length = 200)
	private String email;
	
	@NotNull(message= "o campo cpf nao pode ser nulo")
	@CPF(message ="CPF INVALIDO")
	@Column(name = "cpf",nullable = false, unique = true, length = 60)
	private String cpf;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="data_nascimento",  columnDefinition = "DATE")
	private LocalDate dataNascimento;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	
}
