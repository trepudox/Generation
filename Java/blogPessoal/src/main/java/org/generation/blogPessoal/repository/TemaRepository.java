package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema> findAllTemaByNomeContainingIgnoreCase(String nome);
	
	public Optional<Tema> findOneTemaByNomeIgnoreCase(String nome);
	
}
