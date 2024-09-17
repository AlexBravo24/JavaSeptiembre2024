package com;

public class Llantas {

	private int Rin;
	private String Color;
	private String fecha;
	
	public Llantas() {}

	public Llantas(int rin, String color, String fecha) {
		super();
		Rin = rin;
		Color = color;
		this.fecha = fecha;
	}

	public int getRin() {
		return Rin;
	}

	public void setRin(int rin) {
		Rin = rin;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Llantas [Rin=" + Rin + ", Color=" + Color + ", fecha=" + fecha + "]";
	}
	
	
}
