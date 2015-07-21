package com.pturismo.model;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallepaquete")
public class DetallePaquete {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idDetallePaquete;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "fotolugar", length = 45, nullable = true)
	private String fotoLugar;

	@Column(name = "horasalida", nullable = true)
	private Time horaSalida;

	@Column(name = "horallegada", nullable = true)
	private Time horaLlegada;

	// -----------------------------------------------
	@ManyToOne
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete paquete;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdDetallePaquete() {
		return idDetallePaquete;
	}

	public void setIdDetallePaquete(Integer idDetallePaquete) {
		this.idDetallePaquete = idDetallePaquete;
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

	public String getFotoLugar() {
		return fotoLugar;
	}

	public void setFotoLugar(String fotoLugar) {
		this.fotoLugar = fotoLugar;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Time getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Time horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
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
