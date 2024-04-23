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
public class DomicilioController {
	@Autowired
	private DomicilioBuss domiciliobuss;

	@GetMapping(value = UrlConstantes.CONSULTARDOMICILIO)
	public @ResponseBody List<Domicilio> ConsultardOMICILIO() {
		List<Domicilio> lista = new ArrayList<>();
		try {
			lista = domiciliobuss.consulta();			
			return lista;
		} catch (Exception e) {
			return null;
			
		}
	}
	@PostMapping(value = UrlConstantes.CUARDAR_Estatus)
	public @ResponseBody Base guardar(Domicilio datos) {
		Base respues = new Base();
		try {
			domiciliobuss.guardar(datos);	
			return respues;
		} catch (Exception e) {
			return null;
		}
	}

}
