package com;

public class Perro extends Animal {

	private String raza;
	private String talla;
	private String comportamiento;
	
	public Perro () {
		
	}

	// Source + Generate Constructor using Fields + *importante seleccionar todos
	// los atributos en Persona en la barra de arriba*
	public Perro(String nombre, int edad, double peso, String alimentacion, String raza, String talla,
			String comportamiento) {
		super(nombre, edad, peso, alimentacion);
		this.raza = raza;
		this.talla = talla;
		this.comportamiento = comportamiento;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getComportamiento() {
		return comportamiento;
	}

	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", talla=" + talla + ", comportamiento=" + comportamiento + ", toString()="
				+ super.toString() + "]";
	}
	
	// Método toString: seleccionar solo toSting en la sección Inherited methods
	
	
	
}
