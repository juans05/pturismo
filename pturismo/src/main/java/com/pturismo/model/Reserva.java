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
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idReserva;

	@Column(name = "codigoreserva", length = 100, nullable = false)
	private String codigoreserva;

	@Column(name = "cantpasajeroadulto", nullable = true)
	private Integer cantPasajeroAdulto;

	@Column(name = "cantpasajeroninio", nullable = true)
	private Integer cantPasajeroNinio;

	@Column(name = "cantidadpaquete", nullable = false)
	private Integer cantidadPaquete;

	@Column(name = "estado", length = 20, nullable = false)
	// reservado - pagado - anulado - eliminado
	private String estado;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "precioxpaquete", nullable = false)
	private Double precioXPaquete;

	@Column(name = "precio", nullable = false)
	private Double precio; // Precio de la cantidad*paquete

	@Column(name = "dscto", nullable = true)
	private Double dscto;

	@Column(name = "precioxdscto", nullable = true)
	private Double precioXDscto;

	@Column(name = "preciototal", nullable = false)
	private Double precioTotal;

	// ----------------------------------------------------

	@ManyToOne
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete reservaPaquete;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario reservaUsuario;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public String getCodigoreserva() {
		return codigoreserva;
	}

	public void setCodigoreserva(String codigoreserva) {
		this.codigoreserva = codigoreserva;
	}

	public Integer getCantPasajeroAdulto() {
		return cantPasajeroAdulto;
	}

	public void setCantPasajeroAdulto(Integer cantPasajeroAdulto) {
		this.cantPasajeroAdulto = cantPasajeroAdulto;
	}

	public Integer getCantPasajeroNinio() {
		return cantPasajeroNinio;
	}

	public void setCantPasajeroNinio(Integer cantPasajeroNinio) {
		this.cantPasajeroNinio = cantPasajeroNinio;
	}

	public Integer getCantidadPaquete() {
		return cantidadPaquete;
	}

	public void setCantidadPaquete(Integer cantidadPaquete) {
		this.cantidadPaquete = cantidadPaquete;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Double getPrecioXPaquete() {
		return precioXPaquete;
	}

	public void setPrecioXPaquete(Double precioXPaquete) {
		this.precioXPaquete = precioXPaquete;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getDscto() {
		return dscto;
	}

	public void setDscto(Double dscto) {
		this.dscto = dscto;
	}

	public Double getPrecioXDscto() {
		return precioXDscto;
	}

	public void setPrecioXDscto(Double precioXDscto) {
		this.precioXDscto = precioXDscto;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Paquete getReservaPaquete() {
		return reservaPaquete;
	}

	public void setReservaPaquete(Paquete reservaPaquete) {
		this.reservaPaquete = reservaPaquete;
	}

	public Usuario getReservaUsuario() {
		return reservaUsuario;
	}

	public void setReservaUsuario(Usuario reservaUsuario) {
		this.reservaUsuario = reservaUsuario;
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
