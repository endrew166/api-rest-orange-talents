package com.cadastro.cadastro.usuario;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.br.CPF;

public class CadastroUsuarioRequest {
	@NotBlank
	private String name;
	@Email
	@NotBlank
	private String email;
	@CPF
	@NotBlank
	private String cpf;
	@PastOrPresent
	@NotNull
	private LocalDate dataNascimento;

	public CadastroUsuarioRequest(@NotBlank String name, @Email @NotBlank String email, @CPF @NotBlank String cpf,
			@PastOrPresent LocalDate dataNascimento) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Usuario paraUsuario() {
		return new Usuario(name, email, cpf, dataNascimento);
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

}
