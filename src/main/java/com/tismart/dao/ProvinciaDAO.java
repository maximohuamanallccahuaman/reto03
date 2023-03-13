package com.tismart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.tismart.model.JPAUtil;
import com.tismart.model.Provincia;

public class ProvinciaDAO {
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	public void guardar(Provincia provincia) {
		entity.getTransaction().begin();
		entity.persist(provincia);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	public void editar(Provincia provincia) {
		entity.getTransaction().begin();
		entity.merge(provincia);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	public Provincia buscar(Long id) {
		Provincia p = new Provincia();
		p = entity.find(Provincia.class, id);
		// JPAUtil.shutdown();
		return p;
	}
	
	public void eliminar(Long id) {
		Provincia p = new Provincia();
		p = entity.find(Provincia.class, id);
		entity.getTransaction().begin();
		entity.remove(p);
		entity.getTransaction().commit();
	}
	
	public List<Provincia> obtenerProvincia() {
		List<Provincia> listaProvincias = new ArrayList<>();
		Query q = entity.createQuery("SELECT p FROM Provincia p");
		listaProvincias = q.getResultList();
		return listaProvincias;
	}
}
