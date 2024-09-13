package com;

public class Principal {

	public static void main(String[] args) {
		
		Trabajo empleado = new Trabajo("Cajero", 2, "Si");

		Enfermedad afeccion = new Enfermedad("Diabetes", 2 );
		
		Medicamento farmaco = new Medicamento("Metformina", "CALOX", 14);
		
		Persona jose = new Persona("Jose", "Masculino", 40, afeccion, empleado, farmaco);
		
	    System.out.println(jose);
	
	
	}

}
