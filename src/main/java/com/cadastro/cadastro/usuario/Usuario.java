package com.cadastro.cadastro.usuario;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank @Column(nullable = false)
	private String name;
	@Email @NotBlank @Column(unique = true, nullable = false)
	private String email;
	@CPF @NotBlank @Column(nullable = false)
	private String cpf;
	@PastOrPresent @NotNull
	private LocalDate dataNascimento;
	
	@Deprecated
	public Usuario() {
		}
	
	public Usuario(@NotBlank String name, @Email @NotBlank String email, @CPF @NotBlank String cpf,
			@PastOrPresent LocalDate dataNascimento) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	


}
