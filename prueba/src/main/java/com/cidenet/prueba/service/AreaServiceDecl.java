package com.cidenet.prueba.service;

import java.util.List;

import com.cidenet.prueba.modelo.Area;

public interface AreaServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Area> getAllArea();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Area findById(long id);
}
