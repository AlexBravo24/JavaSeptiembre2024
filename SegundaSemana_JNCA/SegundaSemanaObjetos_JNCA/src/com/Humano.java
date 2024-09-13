package com;

public class Humano {

	private String sexo;
	private int edad;
	private String ocupacion;
	
	public Humano(){
		
	}

	public Humano(String sexo, int edad, String ocupacion) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.ocupacion = ocupacion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Humano [sexo=" + sexo + ", edad=" + edad + ", ocupacion=" + ocupacion + "]";
	}
	
}
