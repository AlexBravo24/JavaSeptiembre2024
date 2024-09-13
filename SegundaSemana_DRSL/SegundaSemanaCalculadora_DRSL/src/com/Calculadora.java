package com;

public abstract class Calculadora 
{	
	private String marca;
	private String material;
	private String color;
	public Calculadora()
	{
		
	}
	public Calculadora(String marca, String material, String color) 
	{
		super();
		this.marca = marca;
		this.material = material;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", material=" + material + ", color=" + color + "]";
	}
	
	//Funciones abstractas
	public abstract float Sumar(float a , float b);
	public abstract float Restar(float a , float b);
	public abstract float Multiplicar(float a , float b);
	public abstract float Dividir(float a , float b);
	
//	public abstract float Sumar(float a , float b , float c);
//	public abstract float Restar(float a , float b, float c);
//	public abstract float Multiplicar(float a , float b, float c);
//	public abstract float Dividir(float a , float b, float c);
}
