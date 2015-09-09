package com.pturismo.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "promocion")
public class Promocion {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idPromocion;

	@Column(name = "fechainicio", nullable = false)
	private Date fechaInicio;

	@Column(name = "fechafinal", nullable = true)
	private Date fechaFinal;

	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;

	@Column(name = "cantidadpromo", nullable = false)
	private Integer cantidadPromo;

	@Column(name = "descuento", nullable = false)
	private Double descuento;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// -----------------------------------------------
	@ManyToOne
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete promocionPaquete;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Integer idPromocion) {
		this.idPromocion = idPromocion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCantidadPromo() {
		return cantidadPromo;
	}

	public void setCantidadPromo(Integer cantidadPromo) {
		this.cantidadPromo = cantidadPromo;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Paquete getPromocionPaquete() {
		return promocionPaquete;
	}

	public void setPromocionPaquete(Paquete promocionPaquete) {
		this.promocionPaquete = promocionPaquete;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
