package com;

public class Carro 
{
	private String marca;
	private int numeroDePuertas;
	private int numeroDeCilindros;
	public Carro()
	{
		
	}
	public Carro(String marca, int numeroDePuertas, int numeroDeCilindros) {
		super();
		this.marca = marca;
		this.numeroDePuertas = numeroDePuertas;
		this.numeroDeCilindros = numeroDeCilindros;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}
	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	public int getNumeroDeCilindros() {
		return numeroDeCilindros;
	}
	public void setNumeroDeCilindros(int numeroDeCilindros) {
		this.numeroDeCilindros = numeroDeCilindros;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", numeroDePuertas=" + numeroDePuertas + ", numeroDeCilindros="
				+ numeroDeCilindros + "]";
	}
	
	
}
