package com.tismart.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PROVINCIA")
public class Provincia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDPROVINCIA")
	private Long id;
	@Column(name="DESCPROVINCIA")
	private String descripcion;
	@Column(name="FECHAREGISTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Provincia [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
	
	

}
