package com;

public class Bocina {
	
	private String Tipodebocinas;
	private String Tecnolog�aAudio;
	private String ConectorAudio;
	
	public Bocina() {
		
	}

	public Bocina(String tipodebocinas, String tecnolog�aAudio, String conectorAudio) {
		super();
		Tipodebocinas = tipodebocinas;
		Tecnolog�aAudio = tecnolog�aAudio;
		ConectorAudio = conectorAudio;
	}

	public String getTipodebocinas() {
		return Tipodebocinas;
	}

	public void setTipodebocinas(String tipodebocinas) {
		Tipodebocinas = tipodebocinas;
	}

	public String getTecnolog�aAudio() {
		return Tecnolog�aAudio;
	}

	public void setTecnolog�aAudio(String tecnolog�aAudio) {
		Tecnolog�aAudio = tecnolog�aAudio;
	}

	public String getConectorAudio() {
		return ConectorAudio;
	}

	public void setConectorAudio(String conectorAudio) {
		ConectorAudio = conectorAudio;
	}

	@Override
	public String toString() {
		return "Bocina [Tipodebocinas=" + Tipodebocinas + ", Tecnolog�aAudio=" + Tecnolog�aAudio + ", ConectorAudio="
				+ ConectorAudio + "]";
	}

	
}
