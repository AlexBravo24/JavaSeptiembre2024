package com.respuesta;

import java.util.Date;

public class Ticket {
	
	// El proposito de esta clase es responder 
	// Si las operaciones se realizaron con exito
	//o no
	
	private int folio;
	private Date fechaHOra;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHOra, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHOra = fechaHOra;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHOra=" + fechaHOra + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
}
