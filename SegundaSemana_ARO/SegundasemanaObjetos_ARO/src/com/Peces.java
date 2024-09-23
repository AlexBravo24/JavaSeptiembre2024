package com;

public class Peces {
	private String raza;
	private String color;
	private double edad;
	private String sexo;
	public Peces () {
	
	
	}
	public Peces(String raza, String color, double edad, String sexo) {
		super();
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getEdad() {
		return edad;
	}
	public void setEdad(double edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Peces [raza=" + raza + ", color=" + color + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	}