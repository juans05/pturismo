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
@Table(name = "integrantesxpaquete")
public class IntegrantesXPaquete {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idIntegrantesXPaquete;

	@Column(name = "codigo", nullable = false)
	private Boolean creador;

	// -------------------------------------
	@ManyToOne
	@JoinColumn(name = "paquetepersonal_id", nullable = false)
	private PaquetePersonal integratePaquetePersonal;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario integranteUsuario;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdIntegrantesXPaquete() {
		return idIntegrantesXPaquete;
	}

	public void setIdIntegrantesXPaquete(Integer idIntegrantesXPaquete) {
		this.idIntegrantesXPaquete = idIntegrantesXPaquete;
	}

	public Boolean getCreador() {
		return creador;
	}

	public void setCreador(Boolean creador) {
		this.creador = creador;
	}

	public PaquetePersonal getIntegratePaquetePersonal() {
		return integratePaquetePersonal;
	}

	public void setIntegratePaquetePersonal(
			PaquetePersonal integratePaquetePersonal) {
		this.integratePaquetePersonal = integratePaquetePersonal;
	}

	public Usuario getIntegranteUsuario() {
		return integranteUsuario;
	}

	public void setIntegranteUsuario(Usuario integranteUsuario) {
		this.integranteUsuario = integranteUsuario;
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
