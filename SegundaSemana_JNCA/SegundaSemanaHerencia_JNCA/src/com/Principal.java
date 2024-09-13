package com;

public class Principal {

	public static void main(String[] args) {
		
		//Probando instanciar una nueva Persona
		
		//Una vez que tenemos una clase abstracta no podemos crear instancias de ella
		//No podemos crear Personas pero si asiganrlas como Emeplados
		//utilizando asi el polimorfismo de asignacion
		Persona Narciso = new Empleado();
		
		//Probando instanciar a un empleado
		Empleado jesus = new Empleado("Jesus", "Masculino", 25, "CAAJ990827GP9", 27000, "Matutino");
		
		//Ejemplo crear a un empleado vacio y posteriormente
		//asignarle solo nombre y salario
		Empleado maria = new Empleado();
		maria.setNombre("Maria");
		maria.setSalario(33000);
		
		System.out.println(Narciso);
		System.out.println(jesus);
		System.out.println(maria);
		
		//Utilizando el metodo comer a traves de una persona o empleado
		//Este metodo es void
		Narciso.comer();
		jesus.comer();
		
		//Utilizando el metodo saludar a traves de una persona
		//Este es un metodo con retorno
		String saludo = Narciso.saludar(); //"Hola buen dia"

		System.out.println(saludo);
		System.out.println(Narciso.saludar());
		System.out.println("Hola soy jesus y tengo " + jesus.getEdad() + " años");
		
		//Probando el metodo comer que ahora es polimorfico
		
		Narciso.comer("Tacos");
		
		jesus.comer("pollo KFC", 2);
		
		//Utilizando metodos propios de un objeto
		jesus.sumar(50, 75);
		
		//Utilizando el metodo trabajar
		Narciso.trabajar();
		
	}

}
