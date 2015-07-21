package com.pturismo.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paquetepersonal")
public class PaquetePersonal {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idPaquetePersonal;

	@Column(name = "nombreviaje", length = 100, nullable = false)
	private String nombreViaje;

	@Column(name = "fechainicio", nullable = false)
	private Date fechaInicio;

	@Column(name = "fechafinal", nullable = true)
	private Date fechaFinal;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "tipoviaje", length = 8, nullable = false)
	private String tipoViaje;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	// ----------------------------------------

	@OneToMany(mappedBy = "itinerarioPaquetePersonal")
	private Collection<ItinerarioLugar> paquetePersonalLugares;

	@OneToMany(mappedBy = "paquetePersonal")
	private Collection<Itinerario> paquetePersonalItinerarios;

	@OneToMany(mappedBy = "integratePaquetePersonal")
	private Collection<IntegrantesXPaquete> paquetePersonalIntegrantes;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdPaquetePersonal() {
		return idPaquetePersonal;
	}

	public void setIdPaquetePersonal(Integer idPaquetePersonal) {
		this.idPaquetePersonal = idPaquetePersonal;
	}

	public String getNombreViaje() {
		return nombreViaje;
	}

	public void setNombreViaje(String nombreViaje) {
		this.nombreViaje = nombreViaje;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Collection<ItinerarioLugar> getPaquetePersonalLugares() {
		return paquetePersonalLugares;
	}

	public void setPaquetePersonalLugares(
			Collection<ItinerarioLugar> paquetePersonalLugares) {
		this.paquetePersonalLugares = paquetePersonalLugares;
	}

	public Collection<Itinerario> getPaquetePersonalItinerarios() {
		return paquetePersonalItinerarios;
	}

	public void setPaquetePersonalItinerarios(
			Collection<Itinerario> paquetePersonalItinerarios) {
		this.paquetePersonalItinerarios = paquetePersonalItinerarios;
	}

	public Collection<IntegrantesXPaquete> getPaquetePersonalIntegrantes() {
		return paquetePersonalIntegrantes;
	}

	public void setPaquetePersonalIntegrantes(
			Collection<IntegrantesXPaquete> paquetePersonalIntegrantes) {
		this.paquetePersonalIntegrantes = paquetePersonalIntegrantes;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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
