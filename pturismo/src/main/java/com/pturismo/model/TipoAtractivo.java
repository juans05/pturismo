package com.pturismo.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipoatractivo")
public class TipoAtractivo {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idTipoAtractivo;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// ------------------------
	@OneToMany(mappedBy = "tipoatractivo")
	private Collection<AtractivoTuristico> tipoatractivos;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdTipoAtractivo() {
		return idTipoAtractivo;
	}

	public void setIdTipoAtractivo(Integer idTipoAtractivo) {
		this.idTipoAtractivo = idTipoAtractivo;
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

	public Collection<AtractivoTuristico> getTipoatractivos() {
		return tipoatractivos;
	}

	public void setTipoatractivos(Collection<AtractivoTuristico> tipoatractivos) {
		this.tipoatractivos = tipoatractivos;
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
