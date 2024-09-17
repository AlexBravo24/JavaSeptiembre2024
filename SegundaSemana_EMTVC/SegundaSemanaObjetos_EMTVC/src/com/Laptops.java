package com;

public class Laptops {

	private String modelo;
	private int ram;
	private double almacenamiento;
	public Laptops(String modelo, int ram, double almacenamiento) {
		super();
		this.modelo = modelo;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}
	
	public Laptops() {
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(double almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	@Override
	public String toString() {
		return "Laptops [modelo= " + modelo + ", ram= " + ram + "Gb, almacenamiento= " + almacenamiento + "Gb]";
	}
	
	
}
