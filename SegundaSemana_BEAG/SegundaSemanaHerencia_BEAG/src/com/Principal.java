package com;

public class Principal {

	public static void main(String[] args) {
		
		// Probando instanciar una nueva Persona
		
		//Una vez que tenemos una clase abstracta no podemos crear instancias de ella
		// Persona juan = new Persona("Juan", "Masculino", 33);
		//Por ello, cambiamos new Persona por new Empleado, ya que no podemos crear Personas
		//pero si asignarle como Empleados utilizando as� el polimorfismo de asignaci�n
		Persona juan = new Empleado();
		
		// Probando instanciar a un Empleado
		Empleado desarrollador = new Empleado("Alejandro", "Masculino", 30, "ABMM98LP7", 20000, "Matutino");
		
		//Ejemplo crear a un empleado vac�o y posteriormente asignarle solo nombre y salario
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(25000);
		
		System.out.println(juan);
		System.out.println(desarrollador);
		System.out.println(jorge);
		
		//Utilizando el m�todo comer a trav�s de una "Persona" o "Empleado"
		//Este m�todo es void
		juan.comer();
		
		jorge.comer();
		
		
		//Utilizando el m�todo saludar a trav�s de una "Persona"
		//Este es un m�todo con retorno	
		String saludo = juan.saludar(); //"Hola Buen D�a"
		
		System.out.println(saludo);
		System.out.println(juan.saludar());
		
		System.out.println("Hola, soy Juan y tengo "+juan.getEdad()+" a�os");
		
		
		//Probando el m�todo comer que ahora es Polim�rfico
		jorge.comer("pizza");
		
		//Probar el m�todo polim�rfico a tarv�s de desarrollador
		desarrollador.comer("tacos", 3);
		
		//---------------------------------------------------------------
		//Utilizando m�todos propios de un Empleado
		jorge.sumar(200, 350);
		
		
		//---------------------------------------------------------------
		//M�todo abstracto
		//Utilizando el m�todo trabajar
		juan.trabajar();
		
		

	}

}
