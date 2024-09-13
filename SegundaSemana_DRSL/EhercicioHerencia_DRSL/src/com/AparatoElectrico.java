package com;

public class AparatoElectrico {

	private float consumoEnergetico;
	private int numeroDeCapacitores;
	private int numeroDeResistencias;
	
	public AparatoElectrico()
	{}
	public AparatoElectrico(float consumoEnergetico, int numeroDeCapacitores, int numeroDeResistencias) {
		super();
		this.consumoEnergetico = consumoEnergetico;
		this.numeroDeCapacitores = numeroDeCapacitores;
		this.numeroDeResistencias = numeroDeResistencias;
	}
	public float getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(float consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getNumeroDeCapacitores() {
		return numeroDeCapacitores;
	}
	public void setNumeroDeCapacitores(int numeroDeCapacitores) {
		this.numeroDeCapacitores = numeroDeCapacitores;
	}
	public int getNumeroDeResistencias() {
		return numeroDeResistencias;
	}
	public void setNumeroDeResistencias(int numeroDeResistencias) {
		this.numeroDeResistencias = numeroDeResistencias;
	}
	@Override
	public String toString() {
		return "AparatoElectrico [consumoEnergetico=" + consumoEnergetico + ", numeroDeCapacitores="
				+ numeroDeCapacitores + ", numeroDeResistencias=" + numeroDeResistencias + "]";
	}

	
	
}
