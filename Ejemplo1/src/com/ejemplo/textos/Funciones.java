package com.ejemplo.textos;

public class Funciones {

	public Funciones(String cad1, int longi) {
		this.cadena1=cad1;
		this.longitud=longi;
	}
	
	public int tamaño(){
		return(longitud=cadena1.length());
	}
		
	private String cadena1;
	private int longitud;
}
