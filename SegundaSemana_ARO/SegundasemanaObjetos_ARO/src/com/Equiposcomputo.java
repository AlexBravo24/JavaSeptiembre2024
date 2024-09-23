package com;

public class Equiposcomputo {
	private String procesador;
	private String tarjetaGrafica;
	private String sistemaOperativo;
	private double capacidaddd;
	private double ram;
	public Equiposcomputo () {
		
	}
	public Equiposcomputo(String procesador, String tarjetaGrafica, String sistemaOperativo, double capacidaddd,
			double ram) {
		super();
		this.procesador = procesador;
		this.tarjetaGrafica = tarjetaGrafica;
		this.sistemaOperativo = sistemaOperativo;
		this.capacidaddd = capacidaddd;
		this.ram = ram;
		
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getTarjetaGrafica() {
		return tarjetaGrafica;
	}
	public void setTarjetaGrafica(String tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public double getCapacidaddd() {
		return capacidaddd;
	}
	public void setCapacidaddd(double capacidaddd) {
		this.capacidaddd = capacidaddd;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Equiposcomputo [procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica + ", sistemaOperativo="
				+ sistemaOperativo + ", capacidaddd=" + capacidaddd + ", ram=" + ram + "]";
	}
	
}
