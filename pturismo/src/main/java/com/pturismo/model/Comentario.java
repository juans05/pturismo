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
@Table(name = "comentario")
public class Comentario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idComentario;

	@Column(name = "comentario", length = 2000, nullable = false)
	private String comentario;

	@Column(name = "fecha", nullable = false)
	private Timestamp fecha;

	@Column(name = "identity", nullable = false)
	private Integer idEntity;

	@Column(name = "entitytype", length = 30, nullable = false)
	private String entityType;

	@Column(name = "reply", nullable = true)
	private Integer reply;

	@Column(name = "visibilidad", length = 30, nullable = false)
	private String visibilidad;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// ----------------------------------------
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario comentarioUsuario;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Integer idComentario) {
		this.idComentario = idComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Integer getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(Integer idEntity) {
		this.idEntity = idEntity;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Integer getReply() {
		return reply;
	}

	public void setReply(Integer reply) {
		this.reply = reply;
	}

	public String getVisibilidad() {
		return visibilidad;
	}

	public void setVisibilidad(String visibilidad) {
		this.visibilidad = visibilidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getComentarioUsuario() {
		return comentarioUsuario;
	}

	public void setComentarioUsuario(Usuario comentarioUsuario) {
		this.comentarioUsuario = comentarioUsuario;
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
