package com;

public class Mesa {

	private String material;
	private double precio;
	private String diseño;
	
	public Mesa() {
		
	}

	public Mesa(String material, double precio, String diseño) {
		super();
		this.material = material;
		this.precio = precio;
		this.diseño = diseño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDiseño() {
		return diseño;
	}

	public void setDiseño(String diseño) {
		this.diseño = diseño;
	}

	@Override
	public String toString() {
		return "Mesa [material=" + material + ", precio=" + precio + ", diseño=" + diseño + "]";
	}
	
}
