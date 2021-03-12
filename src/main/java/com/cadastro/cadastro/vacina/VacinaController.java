package com.cadastro.cadastro.vacina;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.usuario.Usuario;
import com.cadastro.cadastro.usuario.UsuarioRepository;

@RestController
@RequestMapping("/vacina")
public class VacinaController {
	@Autowired
	private VacinaRepository vacinaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@PostMapping
	ResponseEntity<?> CadastrarVacina(@RequestBody @Valid CadastroVacinaRequest requisicao) {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(requisicao.getEmail());
		if(!usuario.isPresent()) {
			return ResponseEntity.badRequest().body("Não existe nenhum usuario com este email");
		}
		
		Vacina novaVacina = requisicao.paraVacina(usuario.get());
		
		vacinaRepository.save(novaVacina);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
