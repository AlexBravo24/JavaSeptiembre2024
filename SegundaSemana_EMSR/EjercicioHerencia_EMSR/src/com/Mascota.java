package com;

public class Mascota {
	
	private String nombredueño;
	private String asunto;
	private int cita;

	public Mascota() {
		
	}

	public Mascota(String nombredueño, String asunto, int cita) {
		super();
		this.nombredueño = nombredueño;
		this.asunto = asunto;
		this.cita = cita;
	}

	public String getNombredueño() {
		return nombredueño;
	}

	public void setNombredueño(String nombredueño) {
		this.nombredueño = nombredueño;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public int getCita() {
		return cita;
	}

	public void setCita(int cita) {
		this.cita = cita;
	}

	@Override
	public String toString() {
		return "Mascota [nombredueño=" + nombredueño + ", asunto=" + asunto + ", cita=" + cita + "]";
	}
	
	
	
	
}
