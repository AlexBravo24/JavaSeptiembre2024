package com;

public class Principal {

	public static void main(String[] args) {
		// Probando instanciar una nueva persona
		
		//Una vez tenemos una clase abstracta no podemos crear instancias de ella
		//No podemos crear Personas pero si asignarlas como empleados
		//utilizando asi el polimorfismo de asignacion
		Persona juan = new Empleado();
		
		//Probando instanciar a un empleado
		Empleado desarrollador = new Empleado("Said", "Masculino",
				24, "SHBDA98LP7", 20000, "Matutino");
		
		//Ejemplo crear a un empleado vacio y posteriormente
		//asignar empleado y salario
		
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(25000);
		
		System.out.println(juan);
		System.out.println(desarrollador);
		System.out.println(jorge);

		//Utilizando el metodo comer a traves de una persona o empleado
		//Este metodo es void
		juan.comer();
		
		
		
		//Utilizando el metodo saludar a traves de una persona
		//Este es un metodo con retorno
		System.out.println(juan.saludar());
		String saludo=juan.saludar();
		
		System.out.println(saludo);
		
		System.out.println("Hola soy Juan y tengo " + juan.getEdad() + " Años");
		
		//Probando el metodo comer que ahora es polimorfico
		
		jorge.comer("Manzana");
		desarrollador.comer("pollo", 2);
		
		//Utilizando el metodo trabajar
		juan.trabajar();
	}

}
