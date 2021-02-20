package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temas")
@CrossOrigin("*")
public class TemaController {
	
	@Autowired
	public TemaRepository repository;
	
	@GetMapping("/get/all")
	public ResponseEntity<List<Tema>> getAll() {
		return new ResponseEntity<List<Tema>>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/get/nome/{nome}")
	public ResponseEntity<Tema> getByNome(@PathVariable String nome) {
		return repository.findOneTemaByNomeIgnoreCase(nome)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/get/id/{id}")
	public ResponseEntity<Tema> getById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}		
	
	@PostMapping("/post")
	public ResponseEntity<Tema> post(@Validated @RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}
		//return new ResponseEntity<Tema>(repository.findById(id), HttpStatus.OK);
	
}