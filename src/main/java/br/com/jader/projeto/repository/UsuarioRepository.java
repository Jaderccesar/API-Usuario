package br.com.jader.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jader.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
}
