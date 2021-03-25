package com.cidenet.prueba.service;

import java.util.List;

import com.cidenet.prueba.modelo.Empleado;

public interface EmpleadoServiceDecl {
	
	
	/**
	 * 
	 * @return
	 */
	public List<Empleado> getAllEmpleados();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Empleado findById(long id);

	/**
	 * 
	 * @param persona
	 * @return
	 * @throws Exception
	 */
	public Empleado add(Empleado empleado);

	/**
	 * 
	 * @param persona
	 * @return
	 */
	public Empleado edit(Empleado empleado);

	/**
	 * 
	 * @param persona
	 */
	public Empleado delete(long id);


}
