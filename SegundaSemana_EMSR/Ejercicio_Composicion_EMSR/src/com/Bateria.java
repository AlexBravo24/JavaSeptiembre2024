package com;

public class Bateria {
	
	private String capacidad;
	private String Tipo;
	private double HorasDeAutonomiaEstimada;
	
	public Bateria() {
		
	}

	public Bateria(String capacidad, String tipo, double horasDeAutonomiaEstimada) {
		super();
		this.capacidad = capacidad;
		Tipo = tipo;
		HorasDeAutonomiaEstimada = horasDeAutonomiaEstimada;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getHorasDeAutonomiaEstimada() {
		return HorasDeAutonomiaEstimada;
	}

	public void setHorasDeAutonomiaEstimada(double horasDeAutonomiaEstimada) {
		HorasDeAutonomiaEstimada = horasDeAutonomiaEstimada;
	}

	@Override
	public String toString() {
		return "Bateria [capacidad=" + capacidad + ", Tipo=" + Tipo + ", HorasDeAutonomiaEstimada="
				+ HorasDeAutonomiaEstimada + "]";
	}

	
	
}
