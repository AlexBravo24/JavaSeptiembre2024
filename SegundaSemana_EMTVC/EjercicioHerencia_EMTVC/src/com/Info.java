package com;

public class Info {

	private String nombre;
	private String dueño;
	private int telefono;
	
	public Info() {}

	public Info(String nombre, String dueño, int telefono) {
		this.nombre = nombre;
		this.dueño = dueño;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Info [nombre=" + nombre + ", dueño=" + dueño + ", telefono=" + telefono + "]";
	}

	
	
	
}
