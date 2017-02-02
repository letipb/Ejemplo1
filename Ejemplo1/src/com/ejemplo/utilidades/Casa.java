package com.ejemplo.utilidades;

import java.util.Scanner;

import com.ejemplo.operaciones.*;
import com.ejemplo.textos.*;

public class Casa {

	public static void main(String[] args) {
	
		int variable1;
		int variable2;
		String cadena1="Mi nombre es Lety";
		int longitud=0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el  valor de la variable1");
		variable1 = leer.nextInt();
		
		System.out.println("Ingrese el valor de la variable2");
		variable2 = leer.nextInt();
		
		
		//int resultado = variable1+variable2;
		//System.out.println("Resultado es igual a " + resultado);
		
		Funciones laLongitud = new Funciones(cadena1,longitud);
		System.out.println("\nEl tama�o de la cadena1 es " + laLongitud.tama�o());
		
		OperacionesBasicas calculadora= new OperacionesBasicas(variable1,variable2);
		System.out.println("La suma es "+ calculadora.sumar());
		System.out.println("La resta es " + calculadora.restar());
		System.out.println("La multiplicaci�n es " + calculadora.multiplicar());
		System.out.println("La divici�n es " + calculadora.dividir());
		System.out.println("El m�dulo es " + calculadora.modulo());
		
		
		System.out.println("\nEl valor de la variable1 es " + calculadora.getVariable1());
		System.out.println("El valor de la variable2 es " + calculadora.getVariable2());

	}

}
