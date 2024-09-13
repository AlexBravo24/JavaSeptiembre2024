package com;

public class Enfermedad {
	
	private String padecimiento;
	private double tiempoPadeciendo;
	

	public Enfermedad() {}


	public Enfermedad(String padecimiento, double tiempoPadeciendo) {
		super();
		this.padecimiento = padecimiento;
		this.tiempoPadeciendo = tiempoPadeciendo;
	}


	public String getPadecimiento() {
		return padecimiento;
	}


	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}


	public double getTiempoPadeciendo() {
		return tiempoPadeciendo;
	}


	public void setTiempoPadeciendo(double tiempoPadeciendo) {
		this.tiempoPadeciendo = tiempoPadeciendo;
	}


	@Override
	public String toString() {
		return "Enfermedad [padecimiento=" + padecimiento + ", tiempoPadeciendo=" + tiempoPadeciendo + "]";
	}

}