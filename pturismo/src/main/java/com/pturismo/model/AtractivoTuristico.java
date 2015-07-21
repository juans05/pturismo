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
@Table(name = "atractivoturistico")
public class AtractivoTuristico {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer idAtractivoTuristico;

	@Column(name = "nombre", length = 200, nullable = false)
	private String nombre;

	@Column(name = "descripcion", length = 2000, nullable = false)
	private String descripcion;

	@Column(name = "latlng", length = 100, nullable = true)
	private String latLng;

	@Column(name = "estado", length = 8, nullable = false)
	private String estado;

	// -------------------------------
	@ManyToOne
	@JoinColumn(name = "tipoatractivo_id", nullable = false)
	private TipoAtractivo tipoatractivo;

	@ManyToOne
	@JoinColumn(name = "ubigeo_id", nullable = false)
	private Ubigeo atractivoUbigeo;

	@OneToMany(mappedBy = "paqueteAtractivoTuristico")
	private Collection<PaqueteLugar> paqueteAtractivoTuristicos;

	@OneToMany(mappedBy = "itinerarioAtractivoTuristico")
	private Collection<ItinerarioLugar> itinerarioAtractivoTuristicos;

	// aditional
	@Column(name = "created_at", nullable = true)
	private Timestamp created_at;
	@Column(name = "updated_at", nullable = true)
	private Timestamp updated_at;

}
