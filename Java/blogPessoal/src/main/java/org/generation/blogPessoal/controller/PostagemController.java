package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Para indicar que � um controller
@RequestMapping("/postagens") //O caminho/URI que vai trazer a resposta do m�todo
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired //Para "instanciar" a interface, para ent�o podermos us�-la. A famosa inje��o de depend�ncias.
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable Long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo-{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	
	/*
	@GetMapping //M�todo/verbo GET
	public String get() {
		return "get!!!";
	}
	
	@PostMapping //M�todo/verbo POST
	public String post() {
		return "post!!!";
	}
	
	@PutMapping //M�todo/verbo PUT
	public String put() {
		return "put!!!";
	}
	
	@DeleteMapping
	public String delete() {
		return "delete!!!";
	}
	*/
}
