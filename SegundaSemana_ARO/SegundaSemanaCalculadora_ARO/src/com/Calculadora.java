package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	//Metodos abstractos
	public abstract void sumar(double a, double b);
	public abstract void restar(double a, double b);
	public abstract void multiplicar(double a, double b);
	public abstract void dividir(double a, double b);

	public void restar() {
		// TODO Auto-generated method stub
		
	}

	public void multiplicar() {
		// TODO Auto-generated method stub
		
	}

	public void dividir() {
		// TODO Auto-generated method stub
		
	}

	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		
	}
	
}
