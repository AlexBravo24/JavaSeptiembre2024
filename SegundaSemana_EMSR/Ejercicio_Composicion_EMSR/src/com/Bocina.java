package com;

public class Bocina {
	
	private String Tipodebocinas;
	private String TecnologíaAudio;
	private String ConectorAudio;
	
	public Bocina() {
		
	}

	public Bocina(String tipodebocinas, String tecnologíaAudio, String conectorAudio) {
		super();
		Tipodebocinas = tipodebocinas;
		TecnologíaAudio = tecnologíaAudio;
		ConectorAudio = conectorAudio;
	}

	public String getTipodebocinas() {
		return Tipodebocinas;
	}

	public void setTipodebocinas(String tipodebocinas) {
		Tipodebocinas = tipodebocinas;
	}

	public String getTecnologíaAudio() {
		return TecnologíaAudio;
	}

	public void setTecnologíaAudio(String tecnologíaAudio) {
		TecnologíaAudio = tecnologíaAudio;
	}

	public String getConectorAudio() {
		return ConectorAudio;
	}

	public void setConectorAudio(String conectorAudio) {
		ConectorAudio = conectorAudio;
	}

	@Override
	public String toString() {
		return "Bocina [Tipodebocinas=" + Tipodebocinas + ", TecnologíaAudio=" + TecnologíaAudio + ", ConectorAudio="
				+ ConectorAudio + "]";
	}

	
}
