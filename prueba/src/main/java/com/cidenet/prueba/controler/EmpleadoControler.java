package com.cidenet.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cidenet.prueba.modelo.Empleado;
import com.cidenet.prueba.service.EmpleadoServiceDecl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/empleado/")
public class EmpleadoControler {

	@Autowired
	private EmpleadoServiceDecl empleadoService;
	
	@GetMapping
	private List<Empleado> listar() {
		return empleadoService.getAllEmpleados();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {	
		
		return empleadoService.add(empleado);
	}

	@GetMapping(path = { "/{id}" })
	private Empleado buscarEmpleadoPorId(@PathVariable("id") Long id) {
		return empleadoService.findById(id);
	}

	@PutMapping(path = { "/{id}" })
	private Empleado editar(@RequestBody Empleado empleado, @PathVariable("id") Long id) {
		empleado.setId(id);
		return empleadoService.edit(empleado);
	}

	@DeleteMapping(path = { "/{id}" })
	private Empleado delete(@PathVariable("id") Long id) {
		return empleadoService.delete(id);
	}
	

}
