package com.cadastro.cadastro.vacina;

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

@Entity
public class Vacina {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank @Column(nullable = false)
	private String name;
	@Email @NotBlank @Column(unique = true, nullable = false)
	private String email;

	@PastOrPresent @NotNull
	private LocalDate dataVacina;
	
	public Vacina(@NotBlank String name, @Email @NotBlank String email, @PastOrPresent LocalDate dataVacina) {
		super();
		this.name = name;
		this.email = email;
		this.dataVacina = dataVacina;
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

	public LocalDate getDataVacina() {
		return dataVacina;
	}


}
