package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadanoBuss {
	
	@Autowired
	private static CiudadanoRepository ciudadanorepos;

	public List<Ciudadano> consulta() {
		return ciudadanorepos.findAll();
	}

	public  Base eliminar(Integer id) throws Exception {
		Base Respuesta = new Base();
		try {
			ciudadanorepos.deleteById(id);
			Respuesta.setpCodRetorno("00000");
			Respuesta.setpMensaje("Se ha elimindado el ciudadano");
			return Respuesta;
		} catch (Exception e) {
			System.out.println(e);
			Respuesta.setpCodRetorno("00001");
			Respuesta.setpMensaje("Fallo en eliminar");
			return Respuesta;
		}
		
		
	}

	public Base guardar(Ciudadano datos) {
		Base Respuesta = new Base();
		try {
			if(datos.getId() == null || datos.getId() == 0) {
				Date fecha = new Date(0);
				datos.setFecha_alta(fecha);
			}
			ciudadanorepos.save(datos);
			Respuesta.setpCodRetorno("00000");
			Respuesta.setpMensaje("Se ha guardado correctamente");
			return Respuesta;
		} catch (Exception e) {
			System.out.println(e);
			Respuesta.setpCodRetorno("00001");
			Respuesta.setpMensaje("Fallo en guardar");
			return Respuesta;
		}
	
		
	}

}
