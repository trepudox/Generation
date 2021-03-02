package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max = 75, message = "Mínimo de 3 caracteres e máximo de 75")
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Mínimo de 5 caracteres e máximo de 20")
	private String usuario;
	
	@NotNull
	@Size(min = 8, max = 50, message = "Mínimo de 8 caracteres e máximo de 50")
	private String senha;
	
}
