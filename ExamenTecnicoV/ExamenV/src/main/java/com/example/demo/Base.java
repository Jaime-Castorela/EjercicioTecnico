package com.example.demo;

import jakarta.persistence.Entity;
import lombok.Data;


public class Base {
	private String pCodRetorno;
    private String pMensaje;
    private Integer pTotalItems;
	public String getpCodRetorno() {
		return pCodRetorno;
	}
	public void setpCodRetorno(String pCodRetorno) {
		this.pCodRetorno = pCodRetorno;
	}
	public String getpMensaje() {
		return pMensaje;
	}
	public void setpMensaje(String pMensaje) {
		this.pMensaje = pMensaje;
	}
	public Integer getpTotalItems() {
		return pTotalItems;
	}
	public void setpTotalItems(Integer pTotalItems) {
		this.pTotalItems = pTotalItems;
	}
    
    
}

