package com.pturismo.model;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idUsuario;

	@Column(name = "email", length = 100, nullable = false)
	private String email;

	@Column(name = "password", length = 50, nullable = false)
	private String password;

	@Column(name = "fechacreacion", nullable = true)
	private Timestamp fechaCreacion;

	@Column(name = "estado", length = 8, nullable = true)
	private String estado;

	// ---------------------------------
	@OneToOne(mappedBy = "usuario")
	private Persona persona;

	// --------------------------------
	@OneToMany(mappedBy = "integranteUsuario")
	private Collection<IntegrantesXPaquete> usuarioIntegrantes;

	@OneToMany(mappedBy = "reservaUsuario")
	private Collection<Reserva> usuarioReservas;

	@OneToMany(mappedBy = "paqueteUsuario")
	private Collection<Paquete> usuarioPaquetes;

	@OneToMany(mappedBy = "attachUsuario")
	private Collection<Attachment> usuarioAttachments;

	@OneToMany(mappedBy = "comentarioUsuario")
	private Collection<Comentario> usuarioComentarios;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Collection<IntegrantesXPaquete> getUsuarioIntegrantes() {
		return usuarioIntegrantes;
	}

	public void setUsuarioIntegrantes(
			Collection<IntegrantesXPaquete> usuarioIntegrantes) {
		this.usuarioIntegrantes = usuarioIntegrantes;
	}

	public Collection<Reserva> getUsuarioReservas() {
		return usuarioReservas;
	}

	public void setUsuarioReservas(Collection<Reserva> usuarioReservas) {
		this.usuarioReservas = usuarioReservas;
	}

	public Collection<Paquete> getUsuarioPaquetes() {
		return usuarioPaquetes;
	}

	public void setUsuarioPaquetes(Collection<Paquete> usuarioPaquetes) {
		this.usuarioPaquetes = usuarioPaquetes;
	}

	public Collection<Attachment> getUsuarioAttachments() {
		return usuarioAttachments;
	}

	public void setUsuarioAttachments(Collection<Attachment> usuarioAttachments) {
		this.usuarioAttachments = usuarioAttachments;
	}

	public Collection<Comentario> getUsuarioComentarios() {
		return usuarioComentarios;
	}

	public void setUsuarioComentarios(Collection<Comentario> usuarioComentarios) {
		this.usuarioComentarios = usuarioComentarios;
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
