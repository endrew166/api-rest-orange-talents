package com.cadastro.cadastro.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
	Optional<Usuario> findByCpf(String cpf);



}
