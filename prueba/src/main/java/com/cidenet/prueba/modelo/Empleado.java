package com.cidenet.prueba.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleado", schema = "cidenet")
public class Empleado {

	private Long id;
	private String primerApellido;
	private String segundoApellido;
	private String primerNombre;
	private String otrosNombres;
	private String numeroIdentificacion;
	private Pais pais;
	private TipoIdentificacion tipoIdentificacion;
	private Area area;
	private Date fechaIngreso;
	private String estado;
	private String correoElectronico;
	private Date fechaRegistro;

	public Empleado() {
	}

	public Empleado(String primerApellido, String segundoApellido, String primerNombre, String otrosNombres,
			String numeroIdentificacion, Pais pais, TipoIdentificacion tipoIdentificacion, Area area, Date fechaIngreso,
			String estado, String correoElectronico) {
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.otrosNombres = otrosNombres;
		this.numeroIdentificacion = numeroIdentificacion;
		this.pais = pais;
		this.tipoIdentificacion = tipoIdentificacion;
		this.area = area;
		this.fechaIngreso = fechaIngreso;
		this.estado = estado;
		this.correoElectronico = correoElectronico;
	}

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "primer_apellido")
	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundo_apellido")
	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Column(name = "primer_nombre")
	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "otros_nombres")
	public String getOtrosNombres() {
		return otrosNombres;
	}

	public void setOtrosNombres(String otrosNombres) {
		this.otrosNombres = otrosNombres;
	}

	@Column(name = "numero_identificacion")
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	@ManyToOne
	@JoinColumn(name = "pais_id")
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@ManyToOne
	@JoinColumn(name = "tipo_identificacion_id")
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	@ManyToOne
	@JoinColumn(name = "area_id")
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Column(name = "fecha_ingreso")
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "estado")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "correo_electronico")
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Column(name = "fecha_registro")
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
