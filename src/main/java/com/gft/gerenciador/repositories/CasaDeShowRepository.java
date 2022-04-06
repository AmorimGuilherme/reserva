package com.gft.gerenciador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.gerenciador.entities.CasaDeShow;

@Repository
public interface CasaDeShowRepository extends JpaRepository<CasaDeShow, Long> {

}
