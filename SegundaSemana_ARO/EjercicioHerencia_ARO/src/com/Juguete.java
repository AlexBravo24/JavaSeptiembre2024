package com;

public class Juguete {
private String marca;
private String publicoFinal;
private String distribuidora;
public Juguete () {
	
}
public Juguete(String marca, String publicoFinal, String distribuidora) {
	super();
	this.marca = marca;
	this.publicoFinal = publicoFinal;
	this.distribuidora = distribuidora;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getPublicoFinal() {
	return publicoFinal;
}
public void setPublicoFinal(String publicoFinal) {
	this.publicoFinal = publicoFinal;
}
public String getDistribuidora() {
	return distribuidora;
}
public void setDistribuidora(String distribuidora) {
	this.distribuidora = distribuidora;
}
@Override
public String toString() {
	return "Juguete [marca=" + marca + ", publicoFinal=" + publicoFinal + ", distribuidora=" + distribuidora + "]";
}

}
