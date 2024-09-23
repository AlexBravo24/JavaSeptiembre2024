package com;

public class Plantas {
private String tipo;
private String color;
private int cantidad;
public Plantas() {}
public Plantas(String tipo, String color, int cantidad) {
	super();
	this.tipo = tipo;
	this.color = color;
	this.cantidad = cantidad;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
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
	return "Plantas [tipo=" + tipo + ", color=" + color + ", cantidad=" + cantidad + "]";
}

}
