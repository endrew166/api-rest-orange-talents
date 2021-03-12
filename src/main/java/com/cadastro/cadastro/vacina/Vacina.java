package com.cadastro.cadastro.vacina;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.cadastro.cadastro.usuario.Usuario;

@Entity
public class Vacina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Column(nullable = false)
	private String name;
	@OneToOne
	private Usuario usuario;

	@PastOrPresent
	@NotNull
	private LocalDate dataVacina;

	public Vacina(@NotBlank String name, Usuario usuario, @PastOrPresent LocalDate dataVacina) {
		super();
		this.name = name;
		this.usuario = usuario;
		this.dataVacina = dataVacina;
	}

}
