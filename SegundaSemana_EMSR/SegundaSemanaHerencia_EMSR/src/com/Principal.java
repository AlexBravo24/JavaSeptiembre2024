package com;

public class Principal {

	public static void main(String[] args) {
		// Probando instanciar una nueva persona
		// una vez tenemos una clase abstracta no podemos crear instancias de ella
		// No podemos crear personas pero si asignarlas como empleados
		//Utilizando asi el poliformismo de asignacion
		Persona juan = new Empleado () ;
		
		// Probando instanciar a un empleado
		
		Empleado desarrollador = new Empleado ("Said", "Masculino", 26,"SHBDA9BLP7",200000, "Matutino");
		
		
		// Ejemplo crear a un empleado vacio y posteriormente
		// asignarle solo nombre y salario
		
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(25000);
		
		System.out.println(juan);
		System.out.println(desarrollador);
		System.out.println(jorge);
		// Utilizando el metodo comer a traves de una persona o empleado
		// Este metodo es vois
		juan.comer();
		
		jorge.comer();
		
		// Utilizando el metodo saludar a traves de una persona o empleado
		// Este metodo es un metodo con retorno
		
		String saludo = juan.saludar(); // "Hola buen dia"
		
		System.out.println(saludo);
		System.out.println(juan.saludar());
		
		System.out.println("Hola soy Juan y tengo "+juan.getEdad()+" años");
		
		// Probando el metodo comer que ahora es polimorfico
		
		jorge.comer("Pizza");
		
		desarrollador.comer("pollo KFC", 2);
		
		juan.comer("tranbajando", "");
		
		//Utilizando metodos propios de un empleado
		
		jorge.sumar(200, 350);
		
		// Utilizando el metodo trabajar
		
		juan.trabajar();
	}

}
