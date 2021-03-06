package com.cidenet.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.cidenet.prueba.modelo.Empleado;
import com.cidenet.prueba.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoServiceDecl {

	@Autowired
	EmpleadoRepository empleadoRepository;
	@Autowired
	private PaisServiceDecl paisServiceDecl;
	@Autowired
	private TipoIdentificacionServiceDecl tipoIdentificacionService;
	@Autowired
	private AreaServiceDecl areaService;

	@Override
	public List<Empleado> getAllEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado findById(long id) {
		return empleadoRepository.findById(id);
	}

	@Override
	public Empleado add(Empleado empleado) {		

		if (empleadoRepository.existsByTipoNumeroIdentificacion(empleado.getTipoIdentificacion().getId(),
				empleado.getNumeroIdentificacion()) == true) {
			throw new DuplicateKeyException("Ya existe usuario con tipo y numero de identificación ingresado: "
					+ empleado.getNumeroIdentificacion());
		}else {
			empleado.setPais(paisServiceDecl.findById(empleado.getPais().getId()));
			empleado.setTipoIdentificacion(tipoIdentificacionService.findById(empleado.getTipoIdentificacion().getId()));
			empleado.setArea(areaService.findById(empleado.getArea().getId()));

			if (empleado.getPais().getDescripcion().equals("Colombia")) {
				empleado.setCorreoElectronico(empleado.getPrimerNombre().toLowerCase().concat(".")
						.concat(empleado.getPrimerApellido().toLowerCase().concat("@cidenet.com.co")));
			} else {
				empleado.setCorreoElectronico(empleado.getPrimerNombre().toLowerCase().concat(".")
						.concat(empleado.getPrimerApellido().toLowerCase().concat("@cidenet.com.us")));
			}
		}

		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado edit(Empleado empleado) {		
		if (empleadoRepository.existsByTipoNumeroIdentificacion(empleado.getTipoIdentificacion().getId(),
				empleado.getNumeroIdentificacion()) == true) {
			throw new DuplicateKeyException("Ya existe usuario con tipo y numero de identificación ingresado: "
					+ empleado.getNumeroIdentificacion());
		}else {
			empleado.setPais(paisServiceDecl.findById(empleado.getPais().getId()));
			empleado.setTipoIdentificacion(tipoIdentificacionService.findById(empleado.getTipoIdentificacion().getId()));
			empleado.setArea(areaService.findById(empleado.getArea().getId()));

			if (empleado.getPais().getDescripcion().equals("Colombia")) {
				empleado.setCorreoElectronico(empleado.getPrimerNombre().toLowerCase().concat(".")
						.concat(empleado.getPrimerApellido().toLowerCase().concat("@cidenet.com.co")));
			} else {
				empleado.setCorreoElectronico(empleado.getPrimerNombre().toLowerCase().concat(".")
						.concat(empleado.getPrimerApellido().toLowerCase().concat("@cidenet.com.us")));
			}
		}
		
		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado delete(long id) {
		Empleado empleado = empleadoRepository.findById(id);

		if (empleado != null) {
			empleadoRepository.delete(empleado);
		}
		return empleado;
	}

}
