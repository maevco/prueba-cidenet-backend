package com.cidenet.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cidenet.prueba.modelo.TipoIdentificacion;
import com.cidenet.prueba.service.TipoIdentificacionServiceDecl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/tipoidentificacion/")
public class TipoIdentificacionService {

	@Autowired
	private TipoIdentificacionServiceDecl tipoIdentificacionService;

	@GetMapping
	private List<TipoIdentificacion> listar() {
		return tipoIdentificacionService.getAllTipoIdentificacion();
	}

	@GetMapping(path = { "/{id}" })
	private TipoIdentificacion buscarTipoIdentificacionPorId(@PathVariable("id") Long id) {
		return tipoIdentificacionService.findById(id);
	}

}
