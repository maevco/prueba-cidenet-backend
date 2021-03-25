package com.cidenet.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cidenet.prueba.modelo.Area;
import com.cidenet.prueba.service.AreaServiceDecl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/area/")
public class AreaService {

	@Autowired
	private AreaServiceDecl areaService;

	@GetMapping
	private List<Area> listar() {
		return areaService.getAllArea();
	}

	@GetMapping(path = { "/{id}" })
	private Area buscarAreaPorId(@PathVariable("id") Long id) {
		return areaService.findById(id);
	}

}
