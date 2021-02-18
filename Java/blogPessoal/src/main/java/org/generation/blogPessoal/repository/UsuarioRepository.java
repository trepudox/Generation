package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByNomeUsuarioIgnoreCase(String nomeUsuario);
	
}
