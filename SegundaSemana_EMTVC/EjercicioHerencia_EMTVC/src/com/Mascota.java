package com;

public class Mascota extends Info{

	private String especie;
	private String raza;
	private String rasgos;
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public Mascota(String nombre, String dueño, int telefono, String especie, String raza, String rasgos) {
		super(nombre, dueño, telefono);
		this.especie = especie;
		this.raza = raza;
		this.rasgos = rasgos;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getRasgos() {
		return rasgos;
	}

	public void setRasgos(String rasgos) {
		this.rasgos = rasgos;
	}

	@Override
	public String toString() {
		return "Mascota [" + (especie != null ? "especie=" + especie + ", " : "")
				+ (raza != null ? "raza=" + raza + ", " : "") + (rasgos != null ? "rasgos=" + rasgos + ", " : "")
				+ (getNombre() != null ? "getNombre()=" + getNombre() + ", " : "")
				+ (getDueño() != null ? "getDueño()=" + getDueño() + ", " : "") + "getTelefono()=" + getTelefono()
				+ "]";
	}

	
}
