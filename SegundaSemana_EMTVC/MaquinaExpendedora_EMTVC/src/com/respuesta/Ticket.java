package com.respuesta;

import java.util.Date;

public class Ticket {

	private long folio;
	private Date fechaHora;
	private double costo;
	private String sucursal;
	
	public Ticket() {}

	public Ticket(long folio, Date fechaHora, double costo, String sucursal) {
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.costo = costo;
		this.sucursal = sucursal;
	}

	public long getFolio() {
		return folio;
	}

	public void setFolio(long folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
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

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", costo=" + costo + ", sucursal=" + sucursal
				+ "]";
	}

	
	
}
