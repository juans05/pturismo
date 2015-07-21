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
@Table(name = "itinerariolugar")
public class ItinerarioLugar {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idItinerarioLugar;

	// --------------------------------------
	@ManyToOne
	@JoinColumn(name = "atractivoturistico_id", nullable = false)
	private AtractivoTuristico itinerarioAtractivoTuristico;

	@ManyToOne
	@JoinColumn(name = "paquetepersonal_id", nullable = false)
	private PaquetePersonal itinerarioPaquetePersonal;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdItinerarioLugar() {
		return idItinerarioLugar;
	}

	public void setIdItinerarioLugar(Integer idItinerarioLugar) {
		this.idItinerarioLugar = idItinerarioLugar;
	}

	public AtractivoTuristico getItinerarioAtractivoTuristico() {
		return itinerarioAtractivoTuristico;
	}

	public void setItinerarioAtractivoTuristico(
			AtractivoTuristico itinerarioAtractivoTuristico) {
		this.itinerarioAtractivoTuristico = itinerarioAtractivoTuristico;
	}

	public PaquetePersonal getItinerarioPaquetePersonal() {
		return itinerarioPaquetePersonal;
	}

	public void setItinerarioPaquetePersonal(
			PaquetePersonal itinerarioPaquetePersonal) {
		this.itinerarioPaquetePersonal = itinerarioPaquetePersonal;
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
