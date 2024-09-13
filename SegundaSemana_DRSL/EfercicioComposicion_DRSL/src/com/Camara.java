package com;

public class Camara
{
	private Lente lente;
	private Bateria bateria;
	private Flash flash;
	
	public Camara()
	{}

	public Camara(Lente lente, Bateria bateria, Flash flash) 
	{
		super();
		this.lente = lente;
		this.bateria = bateria;
		this.flash = flash;
	}

	public Lente getLente() {
		return lente;
	}

	public void setLente(Lente lente) {
		this.lente = lente;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Flash getFlash() {
		return flash;
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	@Override
	public String toString() {
		return "Camara [lente=" + lente + ", bateria=" + bateria + ", flash=" + flash + "]";
	}
	
}


