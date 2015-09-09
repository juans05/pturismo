package com.pturismo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attachment")
public class Archivo {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idArchivo;

	@Column(name = "nombrearchivo", length = 200, nullable = false)
	private String nombreArchivo;

	@Column(name = "tipoarchivo", length = 40, nullable = false)
	private String tipoarchivo;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "identity", nullable = false)
	private Integer idEntidad;

	@Column(name = "tipoentidad", length = 30, nullable = false)
	private String tipoEntidad;

	@Column(name = "tamaño", length = 10, nullable = false)
	private Long tamaño;

	@Column(name = "url", length = 255, nullable = false)
	private String url;

	@Column(name = "visibilidad", length = 30, nullable = false)
	private String visibilidad;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// -----------------------------
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario attachUsuario;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdArchivo() {
		return idArchivo;
	}

	public void setIdArchivo(Integer idArchivo) {
		this.idArchivo = idArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getTipoarchivo() {
		return tipoarchivo;
	}

	public void setTipoarchivo(String tipoarchivo) {
		this.tipoarchivo = tipoarchivo;
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

	public Long getTamaño() {
		return tamaño;
	}

	public void setTamaño(Long tamaño) {
		this.tamaño = tamaño;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public Usuario getAttachUsuario() {
		return attachUsuario;
	}

	public void setAttachUsuario(Usuario attachUsuario) {
		this.attachUsuario = attachUsuario;
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
