package com.gft.teste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.teste.entities.Livro;
import com.gft.teste.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;

	public Livro getLivro(Long id) {

		return livroRepository.getById(id);

	}

}
