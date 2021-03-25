package com.cidenet.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cidenet.prueba.modelo.Pais;
import com.cidenet.prueba.service.PaisServiceDecl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/pais/")
public class PaisControler {

	@Autowired
	private PaisServiceDecl paisService;

	@GetMapping
	private List<Pais> listar() {
		return paisService.getAllPais();
	}

	@GetMapping(path = { "/{id}" })
	private Pais buscarPaisPorId(@PathVariable("id") Long id) {
		return paisService.findById(id);
	}


}
