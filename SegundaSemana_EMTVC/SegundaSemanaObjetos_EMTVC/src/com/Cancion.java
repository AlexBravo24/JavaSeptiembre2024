package com;

public class Cancion {

	private String titulo;
	private String album;
	private String artista;
	
	public Cancion() {
		
	}

	public Cancion(String titulo, String album, String artista) {
		super();
		this.titulo = titulo;
		this.album = album;
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Cancion [titulo= " + titulo + ", album= " + album + ", artista= " + artista + "]";
	}
	
	
}
