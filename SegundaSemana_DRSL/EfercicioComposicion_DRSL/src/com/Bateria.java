package com;

public class Bateria {
	private float capacidad;
	private float peso;
	public Bateria(float capacidad, float peso) {
		super();
		this.capacidad = capacidad;
		this.peso = peso;
	}
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Bateria [capacidad=" + capacidad + ", peso=" + peso + "]";
	}
	
	
}
