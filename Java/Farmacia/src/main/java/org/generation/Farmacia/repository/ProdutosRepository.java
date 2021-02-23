package org.generation.Farmacia.repository;

import java.util.Optional;

import org.generation.Farmacia.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	public Optional<Produtos> findByNomeIgnoreCase(String nome);
	
}
