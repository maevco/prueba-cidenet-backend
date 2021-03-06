package com.cidenet.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidenet.prueba.modelo.Pais;
import com.cidenet.prueba.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisServiceDecl {
	
	
	@Autowired
	private PaisRepository paisRepository;

	@Override
	public List<Pais> getAllPais() {
		return paisRepository.findAll();
	}

	@Override
	public Pais findById(long id) {
		return paisRepository.findById(id);
	}

}
