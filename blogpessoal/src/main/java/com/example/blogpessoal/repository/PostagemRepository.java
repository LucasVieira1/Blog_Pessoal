package com.example.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

//select * from tb_postagem where titulo like %titulo%;
//containing = like
//IgnoreCase ignora maiuscula ou minuscula
}
