package com.gft.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.teste.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
