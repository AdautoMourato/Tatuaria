package com.adauto.tatuaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adauto.tatuaria.entidades.Tatuador;

@Repository
public interface TatuadorRepository extends JpaRepository<Tatuador, Integer>{

}
