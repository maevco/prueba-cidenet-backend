package com.cidenet.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cidenet.prueba.modelo.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	/**
	 * 
	 * @return
	 */
	public List<Empleado> findAll();

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
	 */
	@SuppressWarnings("unchecked")
	public Empleado save(Empleado empleado);

	/**
	 * 
	 * @param id
	 */
	public void delete(Empleado empleado);
	
	/**
	 * 
	 * @param tipoIdentificacion
	 * @param numeroIdentificacion
	 * @return
	 */
	@Query("SELECT CASE WHEN COUNT(e) > 0 THEN 'true' ELSE 'false' END FROM Empleado e JOIN e.tipoIdentificacion ti WHERE ti.id = ?1 AND e.numeroIdentificacion = ?2")
    public boolean existsByTipoNumeroIdentificacion(long tipoIdentificacionId, String numeroIdentificacion);


}
