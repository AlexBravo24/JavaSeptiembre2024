package com;

public class Kilometraje {

	private double totalRecorrido;
	private double distanciaEntreMantenimiento;
	private String unidades;
	
	public Kilometraje () {
		
	}

	public Kilometraje(double totalRecorrido, double distanciaEntreMantenimiento, String unidades) {
		super();
		this.totalRecorrido = totalRecorrido;
		this.distanciaEntreMantenimiento = distanciaEntreMantenimiento;
		this.unidades = unidades;
	}

	public double getTotalRecorrido() {
		return totalRecorrido;
	}

	public void setTotalRecorrido(double totalRecorrido) {
		this.totalRecorrido = totalRecorrido;
	}

	public double getDistanciaEntreMantenimiento() {
		return distanciaEntreMantenimiento;
	}

	public void setDistanciaEntreMantenimiento(double distanciaEntreMantenimiento) {
		this.distanciaEntreMantenimiento = distanciaEntreMantenimiento;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	@Override
	public String toString() {
		return "Kilometraje [totalRecorrido=" + totalRecorrido + ", distanciaEntreMantenimiento="
				+ distanciaEntreMantenimiento + ", unidades=" + unidades + "]";
	}
	
	
	
}
