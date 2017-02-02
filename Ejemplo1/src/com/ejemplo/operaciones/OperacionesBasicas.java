package com.ejemplo.operaciones;

public class OperacionesBasicas {


	public OperacionesBasicas(int a, int b) {
		this.variable1=a;
		this.variable2=b;
	}
	
	public int sumar(){
		
		return (this.variable1+this.variable2);
	}
	
	public int restar(){
		
		return (this.variable1-this.variable2);
	}
	
	public int multiplicar(){
		
		return (this.variable1*this.variable2);
	}
	
	public int dividir(){
		
		return (this.variable1/this.variable2);
	}
	
	public int modulo(){
		
		return (this.variable1%this.variable2);
	}
	
	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}

	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	private int variable1;
	private int variable2;

}
