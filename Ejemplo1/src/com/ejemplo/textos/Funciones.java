package com.ejemplo.textos;

public class Funciones {

	public Funciones(String cad1, int longi) {
		this.setCadena1(cad1);
		this.setLongitud(longi);
	}
	
	public int tamaño(){
		return(setLongitud(getCadena1().length()));
	}
		
	private int getLongitud() {
		return longitud;
	}

	private int setLongitud(int longitud) {
		this.longitud = longitud;
		return longitud;
	}

	private String getCadena1() {
		return cadena1;
	}

	private void setCadena1(String cadena1) {
		this.cadena1 = cadena1;
	}

	private String cadena1;
	private int longitud;
}
