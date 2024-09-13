package com.modelo;

public class Cuenta {
	
	private String Producto;
	private double costo;
	private String tipoPago;
	private double saldo;
	
	
	public Cuenta() {
		
	}


	public Cuenta(String producto, double costo, String tipoPago, double saldo) {
		super();
		Producto = producto;
		this.costo = costo;
		this.tipoPago = tipoPago;
		this.saldo = saldo;
	}


	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getTipoPago() {
		return tipoPago;
	}


	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Cuenta [Producto=" + Producto + ", costo=" + costo + ", tipoPago=" + tipoPago + ", saldo=" + saldo
				+ "]";
	}


	

}
