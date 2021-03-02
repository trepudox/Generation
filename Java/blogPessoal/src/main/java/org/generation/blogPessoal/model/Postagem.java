package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 50, message = "Mínimo de 2 caracteres e máximo de 50")
	private String titulo;
	
	@NotNull
	@Size(min = 2, max = 500, message = "Mínimo de 2 caracteres e máximo de 500")
	private String texto;
	
	@NotNull
	@ManyToOne
	@JsonIgnoreProperties({"postagens", "descricao"})
	private Tema tema;

	@Deprecated
	public Postagem() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Postagem [id=" + id + ", titulo=" + titulo + ", texto=" + texto + ", tema=" + tema + "]";
	}
	
	

}
