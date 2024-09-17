package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String color;
	
	public Calculadora() {}
	
	public Calculadora(String marca, String modelo, String color) {
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
		return "Calculadora [" + (marca != null ? "marca=" + marca + ", " : "")
				+ (modelo != null ? "modelo=" + modelo + ", " : "") + (color != null ? "color=" + color : "") + "]";
	}
	
	public void veces(int i) {
		for (int j = 1; j <= i; j++) {
			System.out.println("Ingrese el valor "+j+":");
		}
	}
	
	

	public abstract void sumar(int i);
	public abstract void restar(int i);
	public abstract void multiplicar(int i);
	public abstract void dividir(int i);
}
