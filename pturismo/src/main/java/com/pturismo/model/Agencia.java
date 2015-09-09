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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idAgencia;

	@Column(name = "code", length = 20, nullable = false)
	private String code;

	@Column(name = "rsocial", length = 100, nullable = false)
	private String rSocial;

	@Column(name = "ncomercial", length = 100, nullable = true)
	private String nComercial;

	@Column(name = "direccion", length = 300, nullable = false)
	private String direccion;

	@Column(name = "telefono", length = 20, nullable = true)
	private String telefono;

	@Column(name = "web", length = 100, nullable = true)
	private String web;

	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@Column(name = "cantpublicacion", nullable = false)
	// default 4
	private Integer cantPublicacion;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "latlng", length = 100, nullable = true)
	private String latLng;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	@Column(name = "imagen", nullable = true)
	private Integer imagen;

	// ---------------------------------------
	@ManyToOne
	@JoinColumn(name = "ubigeo_id", nullable = false)
	private Ubigeo agenciaUbigeo;

	@OneToMany(mappedBy = "paqueteAgencia")
	private Collection<Paquete> agenciaPaquetes;

	@OneToMany(mappedBy = "usuarioAgencia")
	private Collection<Usuario> agenciaUsuarios;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getrSocial() {
		return rSocial;
	}

	public void setrSocial(String rSocial) {
		this.rSocial = rSocial;
	}

	public String getnComercial() {
		return nComercial;
	}

	public void setnComercial(String nComercial) {
		this.nComercial = nComercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCantPublicacion() {
		return cantPublicacion;
	}

	public void setCantPublicacion(Integer cantPublicacion) {
		this.cantPublicacion = cantPublicacion;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public Integer getImagen() {
		return imagen;
	}

	public void setImagen(Integer imagen) {
		this.imagen = imagen;
	}

	public Ubigeo getAgenciaUbigeo() {
		return agenciaUbigeo;
	}

	public void setAgenciaUbigeo(Ubigeo agenciaUbigeo) {
		this.agenciaUbigeo = agenciaUbigeo;
	}

	public Collection<Paquete> getAgenciaPaquetes() {
		return agenciaPaquetes;
	}

	public void setAgenciaPaquetes(Collection<Paquete> agenciaPaquetes) {
		this.agenciaPaquetes = agenciaPaquetes;
	}

	public Collection<Usuario> getAgenciaUsuarios() {
		return agenciaUsuarios;
	}

	public void setAgenciaUsuarios(Collection<Usuario> agenciaUsuarios) {
		this.agenciaUsuarios = agenciaUsuarios;
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
