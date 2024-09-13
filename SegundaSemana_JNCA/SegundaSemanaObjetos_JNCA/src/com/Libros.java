package com;

public class Libros {

	private String genero;
	private int a�o;
	private int numPaginas;
	
	public Libros() {
		
	}

	public Libros(String genero, int a�o, int numPaginas) {
		super();
		this.genero = genero;
		this.a�o = a�o;
		this.numPaginas = numPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libros [genero=" + genero + ", a�o=" + a�o + ", numPaginas=" + numPaginas + "]";
	}
	
}
