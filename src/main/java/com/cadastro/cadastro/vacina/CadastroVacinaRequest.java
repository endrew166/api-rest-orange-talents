package com.cadastro.cadastro.vacina;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.cadastro.cadastro.usuario.Usuario;

public class CadastroVacinaRequest {
	@NotBlank
	private String name;
	@Email
	@NotBlank
	private String email;
	@PastOrPresent
	@NotNull
	private LocalDate dataVacina;

	public CadastroVacinaRequest(@NotBlank String name, @Email @NotBlank String email,
			@PastOrPresent LocalDate dataVacina) {
		super();
		this.name = name;
		this.email = email;
		this.dataVacina = dataVacina;
	}

	public Vacina paraVacina(Usuario usuario) {
		return new Vacina(name, usuario, dataVacina);
	}

	public String getEmail() {
		return email;
	}

}
