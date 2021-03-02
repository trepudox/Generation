package org.generation.blogPessoal.service;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostagemService {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	public List<Postagem> buscarTodos() {
		return postagemRepository.findAll();
	}
	
	public Optional<Postagem> buscarPorID(Long id) {
		return postagemRepository.findById(id);
	}
	
	public List<Postagem> buscarPorTitulo(String titulo) {
		return postagemRepository.findByTituloLikeIgnoreCase(titulo);
	}
	
	public Postagem criarPostagem(Postagem postagem) {
		return postagemRepository.save(postagem);
	}
	
	public Postagem atualizarPostagem(Postagem postagem) {
		return postagemRepository.save(postagem);
	}
	
	public boolean apagarPostagemPorID(Long id) {
		if(postagemRepository.existsById(id)) {
			postagemRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
}
