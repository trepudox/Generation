package org.generation.Farmacia.controller;

import java.util.List;

import org.generation.Farmacia.model.Categorias;
import org.generation.Farmacia.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriasController {

	@Autowired
	public CategoriasRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Categorias>> getAll() {
		return repository.findAll().size() == 0 ? ResponseEntity.status(HttpStatus.NO_CONTENT).build() 
				: ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Categorias> getCategoriaById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
				.orElse(ResponseEntity.status(HttpStatus.NO_CONTENT).build());
	}
	
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categorias>> getAllCategoriasByDescricao(@PathVariable String descricao) {
		return repository.findAllByDescricaoContainingIgnoreCase(descricao).size() == 0 ? ResponseEntity.status(HttpStatus.NO_CONTENT).build()
				: ResponseEntity.status(HttpStatus.OK).body(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categorias> postCategorias(@Validated @RequestBody Categorias categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping 
	public ResponseEntity<Categorias> putCategorias(@Validated @RequestBody Categorias categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<Categorias> deleteCategoria(@PathVariable Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}
