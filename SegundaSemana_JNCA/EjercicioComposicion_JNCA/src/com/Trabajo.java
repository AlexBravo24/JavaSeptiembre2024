package com;

public class Trabajo {

	private String puesto;
	private double experiencia;
	private String activo;
	
	public Trabajo() {}

	public Trabajo(String puesto, double experiencia, String activo) {
		super();
		this.puesto = puesto;
		this.experiencia = experiencia;
		this.activo = activo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Trabajo [puesto=" + puesto + ", experiencia=" + experiencia + ", activo=" + activo + "]";
	}

}