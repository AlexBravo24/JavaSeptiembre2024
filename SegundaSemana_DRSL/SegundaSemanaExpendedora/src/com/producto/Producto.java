package com.producto;

public class Producto 
{
	public String producto;
	public int precio;
	public Producto()
	{
		
	}
	public Producto(String producto, int precio) {
		super();
		this.producto = producto;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
