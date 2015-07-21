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
@Table(name = "paquetelugar")
public class PaqueteLugar {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idPaqueteLugar;

	// -----------------------------
	@ManyToOne
	@JoinColumn(name = "atractivoturistico_id", nullable = false)
	private AtractivoTuristico paqueteAtractivoTuristico;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete paqueteLugarPaquete;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdPaqueteLugar() {
		return idPaqueteLugar;
	}

	public void setIdPaqueteLugar(Integer idPaqueteLugar) {
		this.idPaqueteLugar = idPaqueteLugar;
	}

	public AtractivoTuristico getPaqueteAtractivoTuristico() {
		return paqueteAtractivoTuristico;
	}

	public void setPaqueteAtractivoTuristico(
			AtractivoTuristico paqueteAtractivoTuristico) {
		this.paqueteAtractivoTuristico = paqueteAtractivoTuristico;
	}

	public Paquete getPaqueteLugarPaquete() {
		return paqueteLugarPaquete;
	}

	public void setPaqueteLugarPaquete(Paquete paqueteLugarPaquete) {
		this.paqueteLugarPaquete = paqueteLugarPaquete;
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
