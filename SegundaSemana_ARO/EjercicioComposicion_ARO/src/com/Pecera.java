package com;

public class Pecera {
private int litros;
private String formaPecera;
private String colorFondo;

private Gambas gambas;
private Peces peces;
private Plantas plantas;
public Pecera() {}
public Pecera(int litros, String formaPecera, String colorFondo, Gambas gambas, Peces peces, Plantas plantas) {
	super();
	this.litros = litros;
	this.formaPecera = formaPecera;
	this.colorFondo = colorFondo;
	this.gambas = gambas;
	this.peces = peces;
	this.plantas = plantas;
}
public int getLitros() {
	return litros;
}
public void setLitros(int litros) {
	this.litros = litros;
}
public String getFormaPecera() {
	return formaPecera;
}
public void setFormaPecera(String formaPecera) {
	this.formaPecera = formaPecera;
}
public String getColorFondo() {
	return colorFondo;
}
public void setColorFondo(String colorFondo) {
	this.colorFondo = colorFondo;
}
public Gambas getGambas() {
	return gambas;
}
public void setGambas(Gambas gambas) {
	this.gambas = gambas;
}
public Peces getPeces() {
	return peces;
}
public void setPeces(Peces peces) {
	this.peces = peces;
}
public Plantas getPlantas() {
	return plantas;
}
public void setPlantas(Plantas plantas) {
	this.plantas = plantas;
}
@Override
public String toString() {
	return "Pecera [litros=" + litros + ", formaPecera=" + formaPecera + ", colorFondo=" + colorFondo + ", gambas="
			+ gambas + ", peces=" + peces + ", plantas=" + plantas + "]";
}

}
