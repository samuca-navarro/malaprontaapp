package com.malapronta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malapronta.domain.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer>{

}
