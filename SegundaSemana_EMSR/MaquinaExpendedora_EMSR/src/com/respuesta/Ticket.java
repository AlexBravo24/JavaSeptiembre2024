package com.respuesta;

import java.util.Date;

public class Ticket {

	
	private int folio;
	private Date fechaHOra;
	private String Producto;
	private double costo;
	private String sucursal;
	private int idmaquina;
	private double cambio;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHOra, String producto, double costo, String sucursal, int idmaquina,
			double cambio) {
		super();
		this.folio = folio;
		this.fechaHOra = fechaHOra;
		Producto = producto;
		this.costo = costo;
		this.sucursal = sucursal;
		this.idmaquina = idmaquina;
		this.cambio = cambio;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHOra() {
		return fechaHOra;
	}

	public void setFechaHOra(Date fechaHOra) {
		this.fechaHOra = fechaHOra;
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

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdmaquina() {
		return idmaquina;
	}

	public void setIdmaquina(int idmaquina) {
		this.idmaquina = idmaquina;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHOra=" + fechaHOra + ", Producto=" + Producto + ", costo=" + costo
				+ ", sucursal=" + sucursal + ", idmaquina=" + idmaquina + ", cambio=" + cambio + "]";
	}

	
	
	
}
