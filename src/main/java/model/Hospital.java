package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOSPITAL")
public class Hospital {
	
	@Id
	@Column(name = "IDHOSPITAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "IDDISTRITO")
	private int distrito;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ANTIGUEDAD")
	private String antiguedad;
	
	@Column(name = "AREA")
	private Double area;
	
	@Column(name = "IDSEDE")
	private Sede sede;
	
	@Column(name = "IDGERENTE")
	private Gerente gerente;
	
	@Column(name = "IDCONDICION")
	private Condicion condicion;
	
	@Column(name = "FECHAREGISTRO")
	private Date fecha;
	
	Distrito dis1 = new Distrito();
	
	Sede sed = new Sede();
	
	Gerente gere = new Gerente();
	
	Condicion cond = new Condicion();

	public Sede getSed() {
		return sed;
	}

	public void setSed(Sede sed) {
		this.sed = sed;
	}

	public Gerente getGere() {
		return gere;
	}

	public void setGere(Gerente gere) {
		this.gere = gere;
	}

	public Condicion getCond() {
		return cond;
	}

	public void setCond(Condicion cond) {
		this.cond = cond;
	}

	public Distrito getDis1() {
		return dis1;
	}

	public void setDis1(Distrito dis1) {
		this.dis1 = dis1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDistrito() {
		return distrito;
	}

	public void setDistrito(int distrito) {
		this.distrito = distrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Condicion getCondicion() {
		return condicion;
	}

	public void setCondicion(Condicion condicion) {
		this.condicion = condicion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", distrito=" + distrito + ", nombre=" + nombre + ", antiguedad=" + antiguedad
				+ ", area=" + area + ", sede=" + sede + ", gerente=" + gerente + ", condicion=" + condicion + ", fecha="
				+ fecha + ", dis1=" + dis1 + ", sed=" + sed + ", gere=" + gere + ", cond=" + cond + "]";
	}

	

	
}
