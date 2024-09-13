package com;

public class Celular {
	
	private String marca;
	private String modelo;
	private String color;
	
	private Procesador cpu;
	private Bateria bateria;
	private Bocina bocina;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, Procesador cpu, Bateria bateria, Bocina bocina) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cpu = cpu;
		this.bateria = bateria;
		this.bocina = bocina;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Bocina getBocina() {
		return bocina;
	}

	public void setBocina(Bocina bocina) {
		this.bocina = bocina;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cpu=" + cpu + ", bateria="
				+ bateria + ", bocina=" + bocina + "]";
	}

	
	

}
