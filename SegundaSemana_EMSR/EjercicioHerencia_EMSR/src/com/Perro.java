package com;

public class Perro extends Mascota  {
	
	
	private String nombreperro;
	private String raza;
	private int edad;
	
	public Perro() {
		
	}

	public Perro(String nombredueño, String asunto, int cita, String nombreperro, String raza, int edad) {
		super(nombredueño, asunto, cita);
		this.nombreperro = nombreperro;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombreperro() {
		return nombreperro;
	}

	public void setNombreperro(String nombreperro) {
		this.nombreperro = nombreperro;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [nombreperro=" + nombreperro + ", raza=" + raza + ", edad=" + edad + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
