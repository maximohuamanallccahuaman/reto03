package com.tismart.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.tismart.dao.ProvinciaDAO;
import com.tismart.model.Provincia;

@ManagedBean(name="provinciaBean")
@RequestScoped
public class ProvinciaBean {
	
	public List<Provincia> obtenerProvincias(){
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		return provinciaDAO.obtenerProvincia();
	}
	
	public String nuevo() {
		Provincia p = new Provincia();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("provincia", p);
		return  "/faces/nuevo.xhtml";
	}
	
	public String guardar (Provincia provincia) {
		Date fechaActual= new Date();
		provincia.setFecha(new java.sql.Date(fechaActual.getTime()));
		
		ProvinciaDAO provinciaDAO= new ProvinciaDAO();
		provinciaDAO.guardar(provincia);
		return  "/faces/index.xhtml";
	}
	
	public String editar(Long id) {
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		Provincia p = new Provincia();
		p = provinciaDAO.buscar(id);
		System.out.println(p);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("provincia", p);
		return "/faces/editar.xhtml";
	}

	public String actualizar(Provincia provincia) {
		Date fechaActual= new Date();
		provincia.setFecha(new java.sql.Date(fechaActual.getTime()));
		
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		provinciaDAO.editar(provincia);
		return "/faces/index.xhtml";
	}

	public String eliminar(Long id) {
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		provinciaDAO.eliminar(id);
		System.out.println("Provincia eliminado..");
		return "/faces/index.xhtml";
	}

}
