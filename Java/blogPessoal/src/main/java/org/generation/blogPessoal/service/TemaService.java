package org.generation.blogPessoal.service;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService {
	
	@Autowired
	private TemaRepository temaRepository;
	
	public List<Tema> buscarTodos() {
		return temaRepository.findAll();
	}
	
	public Optional<Tema> buscarPorId(Long id) {
		return temaRepository.findById(id);
	}
	
	public Tema criarTema(Tema tema) {
		return temaRepository.save(tema);
	}
	
	public boolean deletarTema(Long id) {
		if(temaRepository.existsById(id)) {
			temaRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
}
