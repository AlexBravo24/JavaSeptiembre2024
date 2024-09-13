package com;

public class Camion {

	private String marca;
	private String modelo;
	private int a�o;
	private String color;
	
	private Kilometraje kilometraje;
	private Llanta llanta;
	private Motor motor;
	
	
	public Camion () {
		
	}


	public Camion(String marca, String modelo, int a�o, String color, Kilometraje kilometraje, Llanta llanta,
			Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.color = color;
		this.kilometraje = kilometraje;
		this.llanta = llanta;
		this.motor = motor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Kilometraje getKilometraje() {
		return kilometraje;
	}


	public void setKilometraje(Kilometraje kilometraje) {
		this.kilometraje = kilometraje;
	}


	public Llanta getLlanta() {
		return llanta;
	}


	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Camion [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", color=" + color + ", kilometraje="
				+ kilometraje + ", llanta=" + llanta + ", motor=" + motor + "]";
	}
	
	
	
	
	
	
}
