package com;

public abstract class Calculadora {
	
	//Atributos
	private String marca;
	private String color;
	private int modelo;
	
	public Calculadora() {
		
	}
	
	//Constructor using Fields
	public Calculadora(String marca, String color, int modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}

	//Getters and Setters
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	//Método toString
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	//MÉTODO ABSTRACTO
	public abstract void sumar(double a, double b);
	public abstract void restar(double a, double b);
	public abstract void multiplicar(double a, double b);
	public abstract void dividir(double a, double b);
	

}
