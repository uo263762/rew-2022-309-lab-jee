package com.tew.Beans;

public class Calculator {
	
	public int valor;
	
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void suma() {
		valor = a + b;
	}
	public void producto() {
		valor = a * b;
	}
	public void resta() {
		valor = a - b;
	}
	public void division() {
		valor = a / b;
	}
	
	public int getValor() {
		return valor;
	}

}
