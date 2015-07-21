package com.pturismo.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name = "ubigeo")
public class Ubigeo {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idUbigeo;

	@Column(name = "codigo", length = 10, nullable = false)
	private String codigo;

	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	@Column(name = "tipo", length = 15, nullable = false)
	private String tipo;

	@Column(name = "idrel", length = 10, nullable = true)
	private String idrel;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	//-------------------------
	@OneToMany(mappedBy = "atractivoUbigeo")
	private Collection<AtractivoTuristico> atractivoUbigeos;

	@OneToMany(mappedBy = "agenciaUbigeo")
	private Collection<Agencia> agenciaUbigeos;
	
	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdUbigeo() {
		return idUbigeo;
	}

	public void setIdUbigeo(Integer idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdrel() {
		return idrel;
	}

	public void setIdrel(String idrel) {
		this.idrel = idrel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Collection<Agencia> getAgenciaUbigeos() {
		return agenciaUbigeos;
	}

	public void setAgenciaUbigeos(Collection<Agencia> agenciaUbigeos) {
		this.agenciaUbigeos = agenciaUbigeos;
	}

	public Collection<AtractivoTuristico> getAtractivoUbigeos() {
		return atractivoUbigeos;
	}

	public void setAtractivoUbigeos(
			Collection<AtractivoTuristico> atractivoUbigeos) {
		this.atractivoUbigeos = atractivoUbigeos;
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
