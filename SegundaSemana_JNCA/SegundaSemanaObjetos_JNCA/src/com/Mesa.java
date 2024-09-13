package com;

public class Mesa {

	private String material;
	private double precio;
	private String dise�o;
	
	public Mesa() {
		
	}

	public Mesa(String material, double precio, String dise�o) {
		super();
		this.material = material;
		this.precio = precio;
		this.dise�o = dise�o;
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

	public String getDise�o() {
		return dise�o;
	}

	public void setDise�o(String dise�o) {
		this.dise�o = dise�o;
	}

	@Override
	public String toString() {
		return "Mesa [material=" + material + ", precio=" + precio + ", dise�o=" + dise�o + "]";
	}
	
}
