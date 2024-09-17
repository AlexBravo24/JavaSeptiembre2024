package com;

public class Asiento {
	private int Numero;
	private String Material;
	private String Color;
	
	public Asiento() {}

	public Asiento(int numero, String material, String color) {
		super();
		Numero = numero;
		Material = material;
		Color = color;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return " " + Numero + " Asientos " + ", Material= " + Material + ", Color= " + Color;
	}
	
	
}
