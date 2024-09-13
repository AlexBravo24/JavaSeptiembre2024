package com;

public class Transporte {

	private String medio;
	private String id;
	
	public Transporte() {}

	public Transporte(String medio, String id) {
		super();
		this.medio = medio;
		this.id = id;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Transporte [medio=" + medio + ", id=" + id + "]";
	}
	
	
}
