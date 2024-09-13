package com;

public class Mascota {
	
	private String nombredue�o;
	private String asunto;
	private int cita;

	public Mascota() {
		
	}

	public Mascota(String nombredue�o, String asunto, int cita) {
		super();
		this.nombredue�o = nombredue�o;
		this.asunto = asunto;
		this.cita = cita;
	}

	public String getNombredue�o() {
		return nombredue�o;
	}

	public void setNombredue�o(String nombredue�o) {
		this.nombredue�o = nombredue�o;
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
		return "Mascota [nombredue�o=" + nombredue�o + ", asunto=" + asunto + ", cita=" + cita + "]";
	}
	
	
	
	
}
