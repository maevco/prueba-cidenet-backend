package com.cidenet.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidenet.prueba.modelo.Area;
import com.cidenet.prueba.repository.AreaRepository;

@Service
public class AreaServiceImpl implements AreaServiceDecl {

	@Autowired
	private AreaRepository areaRepository;

	@Override
	public List<Area> getAllArea() {
		return areaRepository.findAll();
	}

	@Override
	public Area findById(long id) {
		return areaRepository.findById(id);
	}

}
