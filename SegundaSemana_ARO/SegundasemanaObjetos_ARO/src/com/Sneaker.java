package com;

public class Sneaker {
	private String marca;
	private String modelo;
	private String Horma;
	private double talla;
public Sneaker() {
}
public Sneaker(String marca, String modelo, String horma, double talla) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	Horma = horma;
	this.talla = talla;
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
public String getHorma() {
	return Horma;
}
public void setHorma(String horma) {
	Horma = horma;
}
public double getTalla() {
	return talla;
}
public void setTalla(double talla) {
	this.talla = talla;
}
@Override
public String toString() {
	return "Sneaker [marca=" + marca + ", modelo=" + modelo + ", Horma=" + Horma + ", talla=" + talla + "]";
}

	

}
