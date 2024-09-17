package com;

public class Info {

	private String nombre;
	private String due�o;
	private int telefono;
	
	public Info() {}

	public Info(String nombre, String due�o, int telefono) {
		this.nombre = nombre;
		this.due�o = due�o;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Info [nombre=" + nombre + ", due�o=" + due�o + ", telefono=" + telefono + "]";
	}

	
	
	
}
