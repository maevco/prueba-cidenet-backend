package com.cidenet.prueba.service;

import java.util.List;

import com.cidenet.prueba.modelo.TipoIdentificacion;

public interface TipoIdentificacionServiceDecl {
	/**
	 * 
	 * @return
	 */
	public List<TipoIdentificacion> getAllTipoIdentificacion();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public TipoIdentificacion findById(long id);
}
