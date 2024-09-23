package com;

public class Peces {
private String raza;
private String color;
private int cantidad;
public Peces() {}
public Peces(String raza, String color, int cantidad) {
	super();
	this.raza = raza;
	this.color = color;
	this.cantidad = cantidad;
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
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
@Override
public String toString() {
	return "Peces [raza=" + raza + ", color=" + color + ", cantidad=" + cantidad + "]";
}

}
