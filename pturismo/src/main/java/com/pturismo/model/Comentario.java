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

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "identidad", nullable = false)
	private Integer idEntidad;

	@Column(name = "tipoentidad", length = 30, nullable = false)
	private String tipoEntidad;

	@Column(name = "respuesta", nullable = true)
	private Integer respuesta;

	@Column(name = "visibilidad", length = 30, nullable = false)
	private String visibilidad;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	@Column(name = "valoracion", nullable = true)
	private Integer valoracion;

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

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getTipoEntidad() {
		return tipoEntidad;
	}

	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}

	public Integer getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Integer respuesta) {
		this.respuesta = respuesta;
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

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
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
