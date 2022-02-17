package com.example.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity // mostrar que quero criar uma tabela
@Table(name = "tb_postagem") // create table tb_postagem

public class Postagem {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment, tranfere a responsabilidade para o MySQL
	private long id;

	@NotBlank(message = "O atributo titulo não pode retornar vazio!") // not null
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no mínimo 5 e no máximo 10!") // limita um numero																										// de caracteres
	private String titulo;

	@NotBlank(message = "O atributo texto não pode retornar vazio!") // not null
	@Size(min = 10, max = 1000, message = "O atributo titulo deve conter no mínimo 10 e no máximo 1000!") // limita um																										// numero
	private String texto;

	@UpdateTimestamp // pega a hora automaticamente
	private LocalDateTime data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public void setTexto(String testo) {
		this.texto = testo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
