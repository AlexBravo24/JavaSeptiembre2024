package com;

public class Peliculas {

	private String subgenero;
	private int a�o;
	private String clasificaci�n;
	private double duraci�n;
	
	//Crear constructores:
	//Constructor vac�o:
	public Peliculas() {
		
	}

	//Constructor con todos los par�metros:
	//click derecho + source + using Fields
	public Peliculas(String subgenero, int a�o, String clasificaci�n, double duraci�n) {
		super();
		this.subgenero = subgenero;
		this.a�o = a�o;
		this.clasificaci�n = clasificaci�n;
		this.duraci�n = duraci�n;
	}

	//Constructor Getters and Setters
	//click derecho + soruce + getters and setters
	public String getCategor�a() {
		return subgenero;
	}

	public void setCategor�a(String categor�a) {
		this.subgenero = categor�a;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getClasificaci�n() {
		return clasificaci�n;
	}

	public void setClasificaci�n(String clasificaci�n) {
		this.clasificaci�n = clasificaci�n;
	}

	public double getDuraci�n() {
		return duraci�n;
	}

	public void setDuraci�n(double duraci�n) {
		this.duraci�n = duraci�n;
	}
	
	//M�todo to String
	//click derecho + source + GeneratetoString 
	@Override
	public String toString() {
		return "Peliculas [subgenero=" + subgenero + ", a�o=" + a�o + ", clasificaci�n=" + clasificaci�n + ", duraci�n="
				+ duraci�n + "]";
	}
	
	
	
	
	
	
}
