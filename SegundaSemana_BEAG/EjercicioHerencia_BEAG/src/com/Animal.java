package com;

public class Animal {
	
	// Esta clase ca a ser una "Clase Padre", porque le heredará los
	// atributos y métodos a otra

		private String nombre;
		private int edad;
		private double peso;
		private String alimentacion;

		public Animal () {

		}

		public Animal(String nombre, int edad, double peso, String alimentacion) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.peso = peso;
			this.alimentacion = alimentacion;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public String getAlimentacion() {
			return alimentacion;
		}

		public void setAlimentacion(String alimentacion) {
			this.alimentacion = alimentacion;
		}

		@Override
		public String toString() {
			return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", alimentacion=" + alimentacion
					+ "]";
		}
		
		
		
		

}
