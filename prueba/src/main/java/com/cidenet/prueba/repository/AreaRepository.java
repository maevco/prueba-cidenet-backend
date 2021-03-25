package com.cidenet.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidenet.prueba.modelo.Area;

public interface AreaRepository extends JpaRepository<Area, Long> {

	/**
	 * 
	 * @return
	 */
	public List<Area> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Area findById(long id);

}
