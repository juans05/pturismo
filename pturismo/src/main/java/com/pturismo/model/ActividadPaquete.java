package com.pturismo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actividadpaquete")
public class ActividadPaquete {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idActividadPaquete;

	// references
	@ManyToOne
	@JoinColumn(name = "actividad_id", nullable = false)
	private Actividad actividad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete actividadPaquete;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdActividadPaquete() {
		return idActividadPaquete;
	}

	public void setIdActividadPaquete(Integer idActividadPaquete) {
		this.idActividadPaquete = idActividadPaquete;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Paquete getActividadPaquete() {
		return actividadPaquete;
	}

	public void setActividadPaquete(Paquete actividadPaquete) {
		this.actividadPaquete = actividadPaquete;
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
