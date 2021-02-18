package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Para indicar que é um controller
@RequestMapping("/postagens") //O caminho/URI que vai trazer a resposta do método
@CrossOrigin("*") //Aceita requisições de diversas origens
public class PostagemController {
	
	@Autowired //Para "instanciar" a interface, para então podermos usá-la. A famosa injeção de dependências.
	private PostagemRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/get/id/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable Long id) { //Essa anotação indica que o ID será passado pela URL.
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/get/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){ 
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping("/post")
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem) { //Já essa anotação indica que o objeto Postagem será passado pelo body.
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping("/put")
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/delete/id/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	/*
	@GetMapping //Método/verbo GET
	public String get() {
		return "get!!!";
	}
	
	@PostMapping //Método/verbo POST
	public String post() {
		return "post!!!";
	}
	
	@PutMapping //Método/verbo PUT
	public String put() {
		return "put!!!";
	}
	
	@DeleteMapping
	public String delete() {
		return "delete!!!";
	}
	*/
}
