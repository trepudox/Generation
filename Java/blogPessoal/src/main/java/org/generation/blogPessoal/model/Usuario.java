package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotNull
	@Size(min = 3, max = 20, message = "Mínimo de 3 carcteres e máximo de 20")
	private String nomeUsuario;
	
	@NotNull
	@Size(min = 6, max = 30, message = "Mínimo de 6 caracteres e máximo de 30")
	private String senhaUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDeUsuario() {
		return nomeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeUsuario = nomeDeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	
	
}
