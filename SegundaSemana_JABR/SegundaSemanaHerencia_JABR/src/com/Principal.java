package com;

public class Principal {

	public static void main(String[] args) {
		
		//Probando instanciar una nueva Persona
		
		//Una vez tenemos una clase abstracta no podemos crear instancias de ella
		//No podemos crear Personas pero si asignarlas como Empleados
		//utilizando as� el polimorfismo de asignaci�n
		Persona juan = new Empleado();
		
		//Probando instanciar a un Empleado
		Empleado desarrollador = new Empleado("Said", "Masculino", 
				26, "SHBDA98LP7", 20000, "Matutino");
		
		//Ejemplo crear a un empleado vacio y posteriormente
		//asignarle solo nombre y salario
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(25000);
		
		System.out.println(juan);
		System.out.println(desarrollador);
		System.out.println(jorge);
		
		//Utilizando el m�todo comer a trav�s de una persona o empleado
		//Este m�todo es void
		juan.comer();
		
		jorge.comer();
		
		//Utilizando el m�todo saludar a trav�s de una persona
		//Este es un m�todo con retorno
		String saludo = juan.saludar(); //"Hola Buen D�a"
		
		System.out.println(saludo);
		System.out.println(juan.saludar());
		
		System.out.println("Hola soy Juan y tengo " + juan.getEdad() + " a�os");
		
		//Probando el m�todo comer que ahora es polimorfico
		
		jorge.comer("pizza");
		
		desarrollador.comer("pollo KFC", 2);
		
		juan.comer("Trabajando", "");
		
		//Utilizando m�todos propios de un empleado
		jorge.sumar(200, 350);
		
		//Utilizando el m�todo trabajar
		juan.trabajar();

	}

}
