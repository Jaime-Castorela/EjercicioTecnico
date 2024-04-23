package com.example.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data 
@Table(name = "domicilio")
public class Domicilio {

	
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String direccion;
private Integer No_exterior;
private Integer No_Interior;
private String estaod;
private String ciudad;
;
	
	
}
