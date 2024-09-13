package com;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Persona persona1 = new Empleado();
	Empleado desarrollador = new Empleado("Sid", "M", 26, "ASDDAS23EEA", 20000, "Matutino");
	System.out.println(desarrollador);
	persona1.Comer();
	desarrollador.Comer();
	System.out.println(persona1.Saludar("Hola"));
	persona1.Comer("pizza");
	persona1.Comer("Hamburguesas", 3);
	desarrollador.Comer("SOPAS ", 74);	
	desarrollador.sumar(1, 2);
	persona1.trabajar();
	}

}
