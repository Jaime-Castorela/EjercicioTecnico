package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ciudadanos")
public class CiudadanoController {
	
	@Autowired
	private CiudadanoBuss ciudadanobuss;

	@GetMapping(value = UrlConstantes.CONSULTAR_CIUDADANO)
	public @ResponseBody List<Ciudadano> ConsultarCiudadano() {
		try {
			List<Ciudadano> lista = new ArrayList<>();
			lista = ciudadanobuss.consulta();
			System.out.println("Cuantos datos son:: " +lista.size());			
			return lista;
		} catch (Exception e) {
			List<Ciudadano> lista = new ArrayList<>();
			lista = new ArrayList<>();
		}
		return null;
	}
	
	@PostMapping(value = UrlConstantes.ELIMINAR)
	@ResponseBody
	public  Base eliminarCiudadanos(Integer id) throws Exception {		
		Base respues = new Base();
		try {
			ciudadanobuss.eliminar(id);	
			return respues;
		} catch (Exception e) {
		}
		return respues;
	}
		@PostMapping(value = UrlConstantes.GUARDAR_CIUDADANO)
		public @ResponseBody Base guardarUsuario(Ciudadano datos) {
			try {
				Base respues = new Base();
				ciudadanobuss.guardar(datos);	
				return respues;
			} catch (Exception e) {
				return null;
			}
	}
		
		
		

}
