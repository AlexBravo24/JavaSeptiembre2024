package com;

public class Principal {

	public static void main(String[] args) {
		
		// Probando instanciar una nueva Persona
		
		//Una vez que tenemos una clase abstracta no podemos crear instancias de ella
		// Persona juan = new Persona("Juan", "Masculino", 33);
		//Por ello, cambiamos new Persona por new Empleado, ya que no podemos crear Personas
		//pero si asignarle como Empleados utilizando así el polimorfismo de asignación
		Persona juan = new Empleado();
		
		// Probando instanciar a un Empleado
		Empleado desarrollador = new Empleado("Alejandro", "Masculino", 30, "ABMM98LP7", 20000, "Matutino");
		
		//Ejemplo crear a un empleado vacío y posteriormente asignarle solo nombre y salario
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(25000);
		
		System.out.println(juan);
		System.out.println(desarrollador);
		System.out.println(jorge);
		
		//Utilizando el método comer a través de una "Persona" o "Empleado"
		//Este método es void
		juan.comer();
		
		jorge.comer();
		
		
		//Utilizando el método saludar a través de una "Persona"
		//Este es un método con retorno	
		String saludo = juan.saludar(); //"Hola Buen Día"
		
		System.out.println(saludo);
		System.out.println(juan.saludar());
		
		System.out.println("Hola, soy Juan y tengo "+juan.getEdad()+" años");
		
		
		//Probando el método comer que ahora es Polimórfico
		jorge.comer("pizza");
		
		//Probar el método polimórfico a tarvés de desarrollador
		desarrollador.comer("tacos", 3);
		
		//---------------------------------------------------------------
		//Utilizando métodos propios de un Empleado
		jorge.sumar(200, 350);
		
		
		//---------------------------------------------------------------
		//Método abstracto
		//Utilizando el método trabajar
		juan.trabajar();
		
		

	}

}
