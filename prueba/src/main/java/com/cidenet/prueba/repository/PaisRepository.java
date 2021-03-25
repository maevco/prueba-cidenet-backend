package com.cidenet.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidenet.prueba.modelo.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

	/**
	 * 
	 * @return
	 */
	public List<Pais> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pais findById(long id);

}
