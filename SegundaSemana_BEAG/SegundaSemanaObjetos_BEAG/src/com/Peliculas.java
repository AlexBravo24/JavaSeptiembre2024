package com;

public class Peliculas {

	private String subgenero;
	private int año;
	private String clasificación;
	private double duración;
	
	//Crear constructores:
	//Constructor vacío:
	public Peliculas() {
		
	}

	//Constructor con todos los parámetros:
	//click derecho + source + using Fields
	public Peliculas(String subgenero, int año, String clasificación, double duración) {
		super();
		this.subgenero = subgenero;
		this.año = año;
		this.clasificación = clasificación;
		this.duración = duración;
	}

	//Constructor Getters and Setters
	//click derecho + soruce + getters and setters
	public String getCategoría() {
		return subgenero;
	}

	public void setCategoría(String categoría) {
		this.subgenero = categoría;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getClasificación() {
		return clasificación;
	}

	public void setClasificación(String clasificación) {
		this.clasificación = clasificación;
	}

	public double getDuración() {
		return duración;
	}

	public void setDuración(double duración) {
		this.duración = duración;
	}
	
	//Método to String
	//click derecho + source + GeneratetoString 
	@Override
	public String toString() {
		return "Peliculas [subgenero=" + subgenero + ", año=" + año + ", clasificación=" + clasificación + ", duración="
				+ duración + "]";
	}
	
	
	
	
	
	
}
