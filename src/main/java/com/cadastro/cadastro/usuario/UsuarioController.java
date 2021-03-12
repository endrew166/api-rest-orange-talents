package com.cadastro.cadastro.usuario;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	ResponseEntity<?> CadastrarUsuario(@RequestBody @Valid CadastroUsuarioRequest requisicao) {
		Optional<Usuario> validatorUniqueEmail = usuarioRepository.findByEmail(requisicao.getEmail());
		Optional<Usuario> validatorUniqueCpf = usuarioRepository.findByCpf(requisicao.getCpf());
		
		if(validatorUniqueEmail.isPresent()) {
			return ResponseEntity.badRequest().body("Esse email ja foi cadastrado");
		}
		
		if(validatorUniqueCpf.isPresent()) {
			return ResponseEntity.badRequest().body("Esse cpf ja foi cadastrado");
		}
		
		Usuario novoUsuario = requisicao.paraUsuario();
		usuarioRepository.save(novoUsuario);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
