package com.pturismo.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name = "actividad")
public class Actividad {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idactividad;

	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// references
	@OneToMany(mappedBy = "actividad")
	private Collection<ActividadPaquete> actividadespaquete;
	
	//aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;	

	public Integer getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(Integer idactividad) {
		this.idactividad = idactividad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Collection<ActividadPaquete> getActividadespaquete() {
		return actividadespaquete;
	}

	public void setActividadespaquete(
			Collection<ActividadPaquete> actividadespaquete) {
		this.actividadespaquete = actividadespaquete;
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
