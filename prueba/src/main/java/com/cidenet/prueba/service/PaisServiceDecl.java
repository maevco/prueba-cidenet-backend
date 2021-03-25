package com.cidenet.prueba.service;

import java.util.List;

import com.cidenet.prueba.modelo.Pais;

public interface PaisServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Pais> getAllPais();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pais findById(long id);
}
