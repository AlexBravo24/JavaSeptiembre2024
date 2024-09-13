package com;

public class Persona {

	private String nombre;
	private String sexo;
	private double edad;
	
	private Enfermedad enfermedad;
	private Trabajo trabajo;
	private Medicamento medicamento;
	
	public Persona() {}

	public Persona(String nombre, String sexo, double edad, Enfermedad enfermedad, Trabajo trabajo,
			Medicamento medicamento) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.enfermedad = enfermedad;
		this.trabajo = trabajo;
		this.medicamento = medicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", enfermedad=" + enfermedad
				+ ", trabajo=" + trabajo + ", medicamento=" + medicamento + "]";
	}

	

}