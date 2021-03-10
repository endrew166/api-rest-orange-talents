package com.cadastro.cadastro.usuario;

import java.time.LocalDate;



public class UsuarioResponse {

	
	private Long id;
	private String name;
	private String email;
	private String cpf;
	private LocalDate dataNascimento;

public UsuarioResponse(Usuario Usuario) {
	id = Usuario.getId();
	name = Usuario.getName();
	email = Usuario.getEmail();
	cpf = Usuario.getCpf();
	dataNascimento = Usuario.getDataNascimento();
	

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
