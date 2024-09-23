package com;

public class carritos extends Juguete {
	private String nombre;
	private int anoFabricacion;
	private String Color;
	
	public carritos () {}

	public carritos(String marca, String publicoFinal, String distribuidora, String nombre, int anoFabricacion,
			String color) {
		super(marca, publicoFinal, distribuidora);
		this.nombre = nombre;
		this.anoFabricacion = anoFabricacion;
		this.Color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "carritos [nombre=" + nombre + ", anoFabricacion=" + anoFabricacion + ", Color=" + Color
				+ ", toString()=" + super.toString() + "]";
	}

}
