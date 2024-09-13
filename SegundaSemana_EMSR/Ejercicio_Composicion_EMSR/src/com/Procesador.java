package com;

public class Procesador {
	
	private String marca;
	private String Arquitectura;
	private double Nucleos;
	
	public Procesador() {
		
	}

	public Procesador(String marca, String arquitectura, double nucleos) {
		super();
		this.marca = marca;
		Arquitectura = arquitectura;
		Nucleos = nucleos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getArquitectura() {
		return Arquitectura;
	}

	public void setArquitectura(String arquitectura) {
		Arquitectura = arquitectura;
	}

	public double getNucleos() {
		return Nucleos;
	}

	public void setNucleos(double nucleos) {
		Nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", Arquitectura=" + Arquitectura + ", Nucleos=" + Nucleos + "]";
	}

	
}
