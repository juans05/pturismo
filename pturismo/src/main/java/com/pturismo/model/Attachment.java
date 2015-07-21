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
public class Attachment {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idAttachment;

	@Column(name = "filename", length = 200, nullable = false)
	private String fileName;

	@Column(name = "filetype", length = 40, nullable = false)
	private String fileType;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "identity", nullable = false)
	private Integer idEntity;

	@Column(name = "entitytype", length = 30, nullable = false)
	private String entityType;

	@Column(name = "size", length = 10, nullable = false)
	private Long size;

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

	@OneToOne(mappedBy = "personaThumbnail")
	private Persona attachPersona;

	@OneToOne(mappedBy = "agenciaThumbnail")
	private Agencia attachAgencia;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdAttachment() {
		return idAttachment;
	}

	public void setIdAttachment(Integer idAttachment) {
		this.idAttachment = idAttachment;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
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

	public Persona getAttachPersona() {
		return attachPersona;
	}

	public void setAttachPersona(Persona attachPersona) {
		this.attachPersona = attachPersona;
	}

	public Agencia getAttachAgencia() {
		return attachAgencia;
	}

	public void setAttachAgencia(Agencia attachAgencia) {
		this.attachAgencia = attachAgencia;
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
