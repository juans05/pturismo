package com.pturismo.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atractivoturistico")
public class AtractivoTuristico {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idAtractivoTuristico;

	@Column(name = "nombre", length = 200, nullable = false)
	private String nombre;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "latlng", length = 100, nullable = true)
	private String latLng;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// -------------------------------
	@ManyToOne
	@JoinColumn(name = "tipoatractivo_id", nullable = false)
	private TipoAtractivo tipoatractivo;

	@ManyToOne
	@JoinColumn(name = "ubigeo_id", nullable = false)
	private Ubigeo atractivoUbigeo;

	@OneToMany(mappedBy = "paqueteAtractivoTuristico")
	private Collection<PaqueteLugar> paqueteAtractivoTuristicos;

	@OneToMany(mappedBy = "itinerarioAtractivoTuristico")
	private Collection<ItinerarioLugar> itinerarioAtractivoTuristicos;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdAtractivoTuristico() {
		return idAtractivoTuristico;
	}

	public void setIdAtractivoTuristico(Integer idAtractivoTuristico) {
		this.idAtractivoTuristico = idAtractivoTuristico;
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

	public String getLatLng() {
		return latLng;
	}

	public void setLatLng(String latLng) {
		this.latLng = latLng;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoAtractivo getTipoatractivo() {
		return tipoatractivo;
	}

	public void setTipoatractivo(TipoAtractivo tipoatractivo) {
		this.tipoatractivo = tipoatractivo;
	}

	public Ubigeo getAtractivoUbigeo() {
		return atractivoUbigeo;
	}

	public void setAtractivoUbigeo(Ubigeo atractivoUbigeo) {
		this.atractivoUbigeo = atractivoUbigeo;
	}

	public Collection<PaqueteLugar> getPaqueteAtractivoTuristicos() {
		return paqueteAtractivoTuristicos;
	}

	public void setPaqueteAtractivoTuristicos(
			Collection<PaqueteLugar> paqueteAtractivoTuristicos) {
		this.paqueteAtractivoTuristicos = paqueteAtractivoTuristicos;
	}

	public Collection<ItinerarioLugar> getItinerarioAtractivoTuristicos() {
		return itinerarioAtractivoTuristicos;
	}

	public void setItinerarioAtractivoTuristicos(
			Collection<ItinerarioLugar> itinerarioAtractivoTuristicos) {
		this.itinerarioAtractivoTuristicos = itinerarioAtractivoTuristicos;
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
