package com.pturismo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itinerario")
public class Itinerario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idItinerario;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	// ----------------------------------------
	@ManyToOne
	@JoinColumn(name = "paquetepersonal_id", nullable = false)
	private PaquetePersonal paquetePersonal;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdItinerario() {
		return idItinerario;
	}

	public void setIdItinerario(Integer idItinerario) {
		this.idItinerario = idItinerario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public PaquetePersonal getPaquetePersonal() {
		return paquetePersonal;
	}

	public void setPaquetePersonal(PaquetePersonal paquetePersonal) {
		this.paquetePersonal = paquetePersonal;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

}
