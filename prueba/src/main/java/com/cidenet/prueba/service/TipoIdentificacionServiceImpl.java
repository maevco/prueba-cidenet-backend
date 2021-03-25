package com.cidenet.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidenet.prueba.modelo.TipoIdentificacion;
import com.cidenet.prueba.repository.TipoIdentificacionRepository;

@Service
public class TipoIdentificacionServiceImpl implements TipoIdentificacionServiceDecl {

	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;

	@Override
	public List<TipoIdentificacion> getAllTipoIdentificacion() {
		return tipoIdentificacionRepository.findAll();
	}

	@Override
	public TipoIdentificacion findById(long id) {
		return tipoIdentificacionRepository.findById(id);
	}

}
