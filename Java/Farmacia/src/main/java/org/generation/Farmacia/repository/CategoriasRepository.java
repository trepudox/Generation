package org.generation.Farmacia.repository;

import java.util.List;

import org.generation.Farmacia.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{

	public List<Categorias> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
