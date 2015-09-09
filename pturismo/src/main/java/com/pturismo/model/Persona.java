package com.pturismo.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pturismo.model.Usuario;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idPersona;

	@Column(name = "nombre", length = 50, nullable = true)
	private String nombre;

	@Column(name = "apellido", length = 50, nullable = true)
	private String apellido;

	@Column(name = "tipoidentidad", length = 20, nullable = true)
	private String tipoIdentidad;

	@Column(name = "nroidentidad", length = 30, nullable = true)
	private String nroIdentidad;

	@Column(name = "telefono", length = 20, nullable = true)
	private String telefono;

	@Column(name = "celular", length = 20, nullable = true)
	private String celular;

	@Column(name = "fechanacimiento", nullable = true)
	private Date fechaNacimiento;

	@Column(name = "pais", length = 20, nullable = true)
	private String pais;

	@Column(name = "imagen")
	private Integer imagen;

	// -----------------------------------------------
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoIdentidad() {
		return tipoIdentidad;
	}

	public void setTipoIdentidad(String tipoIdentidad) {
		this.tipoIdentidad = tipoIdentidad;
	}

	public String getNroIdentidad() {
		return nroIdentidad;
	}

	public void setNroIdentidad(String nroIdentidad) {
		this.nroIdentidad = nroIdentidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getImagen() {
		return imagen;
	}

	public void setImagen(Integer imagen) {
		this.imagen = imagen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
