package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import dao.ProvinciaImpl;
import model.Provincia;

@Named("provinciaC")
public class ProvinciaController {

	private Provincia modelo;
	private ProvinciaImpl impl;
	private List<Provincia> listado;
	
	public ProvinciaController(){
		modelo = new Provincia();
		impl = new ProvinciaImpl();
		listado = new ArrayList<>();
	}
	
    public void listar() {
            try {
                listado = impl.listar();
            } catch (Exception e) {
                System.out.println("Error en listar ProvinciaC: " + e.getMessage());
            }
    }
    
    @PostConstruct
    public void construir() {
        listar();
    }
	
	public Provincia getModelo() {
		return modelo;
	}

	public void setModelo(Provincia modelo) {
		this.modelo = modelo;
	}

	public ProvinciaImpl getImpl() {
		return impl;
	}

	public void setImpl(ProvinciaImpl impl) {
		this.impl = impl;
	}

	public List<Provincia> getListado() {
		return listado;
	}

	public void setListado(List<Provincia> listado) {
		this.listado = listado;
	}
    
    
}
