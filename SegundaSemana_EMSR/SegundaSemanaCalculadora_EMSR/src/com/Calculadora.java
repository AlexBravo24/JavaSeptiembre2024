package com;

public abstract class Calculadora {

	private String marca;
	private String color;
	private String fuenteenergia;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String fuenteenergia) {
		super();
		this.marca = marca;
		this.color = color;
		this.fuenteenergia = fuenteenergia;
	}

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

	public String getFuenteenergia() {
		return fuenteenergia;
	}

	public void setFuenteenergia(String fuenteenergia) {
		this.fuenteenergia = fuenteenergia;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", fuenteenergia=" + fuenteenergia + "]";
	}
	
	//Metodos abstractos
	
	public abstract void sumar(float a, float b);
	
	public abstract void sumar(float a, float b, float c);
	
	public abstract void restar(float a, float b,float c);
	public abstract void restar(float a, float b);
	
	public abstract void multiplicar(float a, float b, float c);
	
	public abstract void multiplicar(float a, float b);
	
	public abstract void dividir(float a, float b, float c);
	
	public abstract void dividir(float a, float b);
}

