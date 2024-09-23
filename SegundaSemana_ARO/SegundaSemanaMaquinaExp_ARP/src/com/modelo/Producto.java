package com.modelo;

public class Producto {
//guardamos la informacion de los objetos o entidades
//crearemos varios productos y se agrega a un hashmap
	
	private int codigoProducto;
	private String nombreProducto;
	private int costo;
	private int cantidad;
	public Producto() {}
	public Producto(int codigoProducto, String nombreProducto, int costo, int cantidad) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.costo = costo;
		this.cantidad = cantidad;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", costo=" + costo
				+ ", cantidad=" + cantidad + "]";
	}
	
}
