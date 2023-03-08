package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Provincia;

public class ProvinciaImpl extends Conexion implements ICRUD<Provincia> {
	
	DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public static Date stringToFecha(String fecha) throws ParseException, java.text.ParseException {
        return fecha != null ? (Date) new SimpleDateFormat("dd-MM-yyyy").parse(fecha) : null;
    }

	@Override
	public void registrar(Provincia modelo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Provincia modelo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Provincia modelo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Provincia> listar() throws Exception {
		List<Provincia> listado = null;
		Provincia provincia;
		String sql = "SELECT * FROM PROVINCIA ORDER BY IDPROVINCIA DESC";
		try {
            listado = new ArrayList();
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                provincia = new Provincia();
                provincia.setId(rs.getInt("id"));
                provincia.setDescripcion(rs.getString("descripcion"));
                provincia.setFecha(rs.getDate("fecha"));
                listado.add(provincia);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en listar Provincias" + e.getMessage());
        } finally {
            this.cerrar();
        }
        return listado;
	}

}
