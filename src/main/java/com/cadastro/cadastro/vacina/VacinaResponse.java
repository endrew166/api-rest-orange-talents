package com.cadastro.cadastro.vacina;

import java.time.LocalDate;

public class VacinaResponse {
	
	private Long id;
	private String name;
	private String email;
	private LocalDate dataVacina;

public VacinaResponse(Vacina vacina) {
	id = vacina.getId();
	name = vacina.getName();
	email = vacina.getEmail();
	dataVacina = vacina.getDataVacina();
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
