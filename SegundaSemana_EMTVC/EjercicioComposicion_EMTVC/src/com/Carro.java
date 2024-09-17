package com;

public class Carro {

	private String Marca;
	private String Modelo;
	private String Color;
	private Asiento asiento;
	private Motor motor;
	private Llantas llanta;
	private int precio;
	
	public Carro() {}

	public Carro(String marca, String modelo, String color, Asiento asiento, Motor motor, Llantas llanta, int precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		this.asiento = asiento;
		this.motor = motor;
		this.llanta = llanta;
		this.precio = precio;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Llantas getLlanta() {
		return llanta;
	}

	public void setLlanta(Llantas llanta) {
		this.llanta = llanta;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Carro [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", asiento=" + asiento + ", motor="
				+ motor + ", llanta=" + llanta + ", precio= $" + precio + "]";
	}
	
	
}
