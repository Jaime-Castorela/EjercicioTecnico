package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioBuss {

	@Autowired
	private DomicilioRepository demociliorepos;
	
	public List<Domicilio> consulta() {
		return demociliorepos.findAll();
	}

	public void guardar(Domicilio datos) {
		Base Respuesta = new Base();
		try {
			
			demociliorepos.save(datos);
			Respuesta.setpCodRetorno("00000");
			Respuesta.setpMensaje("Se ha guardado correctamente");
			return;
		} catch (Exception e) {
			System.out.println(e);
			Respuesta.setpCodRetorno("00001");
			Respuesta.setpMensaje("Fallo en guardar");
			return;
		}
		
	}

}
