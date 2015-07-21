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
@Table(name = "categoriapaquete")
public class CategoriaPaquete {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idCategoriaPaquete;

	// references
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paquete_id", nullable = false)
	private Paquete categoriaPaquete;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdCategoriaPaquete() {
		return idCategoriaPaquete;
	}

	public void setIdCategoriaPaquete(Integer idCategoriaPaquete) {
		this.idCategoriaPaquete = idCategoriaPaquete;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Paquete getCategoriaPaquete() {
		return categoriaPaquete;
	}

	public void setCategoriaPaquete(Paquete categoriaPaquete) {
		this.categoriaPaquete = categoriaPaquete;
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
