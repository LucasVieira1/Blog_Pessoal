package com.example.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogpessoal.model.Postagem;
import com.example.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping ("/postagens")
@CrossOrigin (origins = "*", allowedHeaders = "*") //headers libera todo cabeçalho, Sem o origin meu programa só roda se meu front e back estiverem sendo rodados no mesmo endereço. O origin permite que meu programa rode com front e back sendo processados em endereços diferentes (um no heroku e outro no netlify)


public class PostagemController {
	@Autowired //cria a injeção de dependencia
	private PostagemRepository postagemRepository;

	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll()); //findall select * tb_postagens
	}
}
