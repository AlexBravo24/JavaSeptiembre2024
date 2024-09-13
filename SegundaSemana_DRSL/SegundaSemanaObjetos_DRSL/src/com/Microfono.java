package com;

public class Microfono {

	private String marca;
	private int maximos_DB;
	private String tipoDeEntrada;
	
	public Microfono()
	{
		
	}

	public Microfono(String marca, int maximos_DB, String tipoDeEntrada) {
		super();
		this.marca = marca;
		this.maximos_DB = maximos_DB;
		this.tipoDeEntrada = tipoDeEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMaximos_DB() {
		return maximos_DB;
	}

	public void setMaximos_DB(int maximos_DB) {
		this.maximos_DB = maximos_DB;
	}

	public String getTipoDeEntrada() {
		return tipoDeEntrada;
	}

	public void setTipoDeEntrada(String tipoDeEntrada) {
		this.tipoDeEntrada = tipoDeEntrada;
	}

	@Override
	public String toString() {
		return "Microfono [marca=" + marca + ", maximos_DB=" + maximos_DB + ", tipoDeEntrada=" + tipoDeEntrada + "]";
	}
	
}
