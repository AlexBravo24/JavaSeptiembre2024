package com;

public class Principal {

	public static void main(String[] args) {
		
		//Probando instanciar una nueva Persona
		
		//Una vez tenemos una clase abstracta no podemos crear instancias de ella
		//No podemos crear Personas pero si asignarlas como Empleados
		//utilizando así el polimorfismo de asignación
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
		
		//Utilizando el método comer a través de una persona o empleado
		//Este método es void
		juan.comer();
		
		jorge.comer();
		
		//Utilizando el método saludar a través de una persona
		//Este es un método con retorno
		String saludo = juan.saludar(); //"Hola Buen Día"
		
		System.out.println(saludo);
		System.out.println(juan.saludar());
		
		System.out.println("Hola soy Juan y tengo " + juan.getEdad() + " años");
		
		//Probando el método comer que ahora es polimorfico
		
		jorge.comer("pizza");
		
		desarrollador.comer("pollo KFC", 2);
		
		juan.comer("Trabajando", "");
		
		//Utilizando métodos propios de un empleado
		jorge.sumar(200, 350);
		
		//Utilizando el método trabajar
		juan.trabajar();

	}

}
