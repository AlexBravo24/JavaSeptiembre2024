package com.respuesta;

import java.util.Date;

public class Ticket {
//el proposito es reponder si las operaciones se realizaron exito
	private int folio;
	private Date fechaHora;
	private int cambio;
	private String idMaquina;
	
	public Ticket() {}

	public Ticket(int folio, Date fechaHora, int cambio, String idMaquina) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.cambio = cambio;
		this.idMaquina = idMaquina;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public String getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(String idMaquina) {
		this.idMaquina = idMaquina;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", cambio=" + cambio + ", idMaquina=" + idMaquina
				+ "]";
	}

}