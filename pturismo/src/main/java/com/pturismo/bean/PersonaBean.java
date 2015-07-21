package com.pturismo.bean;

import java.sql.Date;

public class PersonaBean {

	// usuario
	private String email;
	private String password;
	// persona
	private String nombre;
	private String apellido;
	private String tipoIdentidad;
	private String nroIdentidad;
	private String telefono;
	private String celular;
	private Date fechaNacimiento;
	private Date pais;
	private Date rol;
	private String thumbnailUrl;

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

	public Date getPais() {
		return pais;
	}

	public void setPais(Date pais) {
		this.pais = pais;
	}

	public Date getRol() {
		return rol;
	}

	public void setRol(Date rol) {
		this.rol = rol;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
