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
import javax.persistence.Table;

@Entity
@Table(name = "paquete")
public class Paquete {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idPaquete;

	@Column(name = "codigo", length = 30, nullable = false)
	private String codigo;

	@Column(name = "nombrepaquete", length = 200, nullable = false)
	private String nombrepaquete;

	@Column(name = "nrodias", length = 15, nullable = false)
	private String nroDias;

	@Column(name = "nronoches", length = 15, nullable = false)
	private String nroNoches;

	@Column(name = "anticipacion", length = 20, nullable = true)
	private String anticipacion;

	@Column(name = "cantpersonas", nullable = true)
	private Integer cantPersonas;

	@Column(name = "precioadulto", nullable = true)
	private Double precioAdulto;

	@Column(name = "precioninio", nullable = true)
	private Double precioNinio;

	@Column(name = "preciototal", nullable = true)
	private Double precioTotal;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "incluye", length = 2000, nullable = true)
	private String incluye;

	@Column(name = "noincluye", length = 2000, nullable = true)
	private String noIncluye;

	@Column(name = "notaactividad", length = 2000, nullable = true)
	private String notaActividad;

	@Column(name = "encargada", length = 100, nullable = true)
	private String encargada;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	@Column(name = "publicado", nullable = false)
	private Boolean publicado;

	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;

	@Column(name = "fechafin", nullable = true)
	private Timestamp fechaFin;

	@Column(name = "destacado", nullable = false)
	private Boolean destacado;

	// ---------------------

	@ManyToOne
	@JoinColumn(name = "agencia_id", nullable = false)
	private Agencia paqueteAgencia;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario paqueteUsuario;

	@OneToMany(mappedBy = "actividadPaquete")
	private Collection<ActividadPaquete> paqueteActividades;

	@OneToMany(mappedBy = "categoriaPaquete")
	private Collection<CategoriaPaquete> paqueteCategorias;

	@OneToMany(mappedBy = "promocionPaquete")
	private Collection<Promocion> paquetePromociones;

	@OneToMany(mappedBy = "paqueteLugarPaquete")
	private Collection<PaqueteLugar> paqueteLugares;

	@OneToMany(mappedBy = "paquete")
	private Collection<DetallePaquete> paqueteDetalles;

	@OneToMany(mappedBy = "reservaPaquete")
	private Collection<Reserva> paqueteReservas;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

	public Integer getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrepaquete() {
		return nombrepaquete;
	}

	public void setNombrepaquete(String nombrepaquete) {
		this.nombrepaquete = nombrepaquete;
	}

	public String getNroDias() {
		return nroDias;
	}

	public void setNroDias(String nroDias) {
		this.nroDias = nroDias;
	}

	public String getNroNoches() {
		return nroNoches;
	}

	public void setNroNoches(String nroNoches) {
		this.nroNoches = nroNoches;
	}

	public String getAnticipacion() {
		return anticipacion;
	}

	public void setAnticipacion(String anticipacion) {
		this.anticipacion = anticipacion;
	}

	public Integer getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(Integer cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public Double getPrecioAdulto() {
		return precioAdulto;
	}

	public void setPrecioAdulto(Double precioAdulto) {
		this.precioAdulto = precioAdulto;
	}

	public Double getPrecioNinio() {
		return precioNinio;
	}

	public void setPrecioNinio(Double precioNinio) {
		this.precioNinio = precioNinio;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIncluye() {
		return incluye;
	}

	public void setIncluye(String incluye) {
		this.incluye = incluye;
	}

	public String getNoIncluye() {
		return noIncluye;
	}

	public void setNoIncluye(String noIncluye) {
		this.noIncluye = noIncluye;
	}

	public String getNotaActividad() {
		return notaActividad;
	}

	public void setNotaActividad(String notaActividad) {
		this.notaActividad = notaActividad;
	}

	public String getEncargada() {
		return encargada;
	}

	public void setEncargada(String encargada) {
		this.encargada = encargada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Boolean getPublicado() {
		return publicado;
	}

	public void setPublicado(Boolean publicado) {
		this.publicado = publicado;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getDestacado() {
		return destacado;
	}

	public void setDestacado(Boolean destacado) {
		this.destacado = destacado;
	}

	public Agencia getPaqueteAgencia() {
		return paqueteAgencia;
	}

	public void setPaqueteAgencia(Agencia paqueteAgencia) {
		this.paqueteAgencia = paqueteAgencia;
	}

	public Usuario getPaqueteUsuario() {
		return paqueteUsuario;
	}

	public void setPaqueteUsuario(Usuario paqueteUsuario) {
		this.paqueteUsuario = paqueteUsuario;
	}

	public Collection<ActividadPaquete> getPaqueteActividades() {
		return paqueteActividades;
	}

	public void setPaqueteActividades(
			Collection<ActividadPaquete> paqueteActividades) {
		this.paqueteActividades = paqueteActividades;
	}

	public Collection<CategoriaPaquete> getPaqueteCategorias() {
		return paqueteCategorias;
	}

	public void setPaqueteCategorias(
			Collection<CategoriaPaquete> paqueteCategorias) {
		this.paqueteCategorias = paqueteCategorias;
	}

	public Collection<Promocion> getPaquetePromociones() {
		return paquetePromociones;
	}

	public void setPaquetePromociones(Collection<Promocion> paquetePromociones) {
		this.paquetePromociones = paquetePromociones;
	}

	public Collection<PaqueteLugar> getPaqueteLugares() {
		return paqueteLugares;
	}

	public void setPaqueteLugares(Collection<PaqueteLugar> paqueteLugares) {
		this.paqueteLugares = paqueteLugares;
	}

	public Collection<DetallePaquete> getPaqueteDetalles() {
		return paqueteDetalles;
	}

	public void setPaqueteDetalles(Collection<DetallePaquete> paqueteDetalles) {
		this.paqueteDetalles = paqueteDetalles;
	}

	public Collection<Reserva> getPaqueteReservas() {
		return paqueteReservas;
	}

	public void setPaqueteReservas(Collection<Reserva> paqueteReservas) {
		this.paqueteReservas = paqueteReservas;
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
