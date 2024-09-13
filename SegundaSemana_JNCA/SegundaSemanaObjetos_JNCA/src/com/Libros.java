package com;

public class Libros {

	private String genero;
	private int año;
	private int numPaginas;
	
	public Libros() {
		
	}

	public Libros(String genero, int año, int numPaginas) {
		super();
		this.genero = genero;
		this.año = año;
		this.numPaginas = numPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libros [genero=" + genero + ", año=" + año + ", numPaginas=" + numPaginas + "]";
	}
	
}
