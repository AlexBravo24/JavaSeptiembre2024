package com;

public class Motor {

	private String modelo;
	private int cilindros;
	private int caballos;
	
	public Motor() {}

	public Motor(String modelo, int cilindros, int caballos) {
		super();
		this.modelo = modelo;
		this.cilindros = cilindros;
		this.caballos = caballos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return "modelo=" + modelo + ", cilindros=" + cilindros + ", caballos=" + caballos;
	}
	
	
}
