package com.example.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // ser reconhecida como banco de dados
@Table(name = "tb_tema") // create tb_tema

public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment, responsabilidade fica para o MySQL
	private long id;

	@NotBlank(message = "O atributo não pode retornar vazio!") // not null
	private String descricao;

	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) // mapped = dar o nome pro relacionamento, cascate = toda alteração para a tabnela_tb tema vai afetar tbm a															// tb_postagem
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem; // list pq pode ter mais de uma postagem

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
