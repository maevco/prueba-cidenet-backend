package com.cidenet.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidenet.prueba.modelo.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {

	/**
	 * 
	 * @return
	 */
	public List<TipoIdentificacion> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public TipoIdentificacion findById(long id);

}
