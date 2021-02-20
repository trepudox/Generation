package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
public class Postagem {
	
	@Id //Define a Primary Key, vulgo ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Incremento para o ID
	private Long id;
	
	@NotNull //Define que o campo não pode ser nulo
	@Size(min = 2, max = 75) //Define o tamanho mínimo e tamanho máximo do campo
	private String titulo;
	
	@NotNull
	@Size(min = 3, max = 500)
	private String texto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties("postagens")
	private Tema tema;
	
	@Temporal(TemporalType.TIMESTAMP) //Define que é um tipo de Tempo
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
	
}
