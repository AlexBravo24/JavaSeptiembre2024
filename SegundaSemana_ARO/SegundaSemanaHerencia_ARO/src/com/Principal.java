package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona juan = new Persona("juan", "masculino", 33);
Empleado desarrollador = new Empleado("said", "masculino", 24, "reoa950423", 20000, "matutino");
//ejemplo crear un empleado vacio y posteriormente 
//asignarle solo nombre y salario
Empleado jorge = new Empleado();
jorge.setSalario(25000);
jorge.setNombre("jorge");
System.out.println(juan);
System.out.println(desarrollador);
System.out.println(jorge);
//metodo void
juan.comer();
jorge.comer();

//este es un metodo con retorno
String saludo = juan.saludar();
System.out.println(saludo);
System.out.println(juan.saludar());
//probando metodo comer que ahora es polimorfico
jorge.comer("pizza");
desarrollador.comer("pizza", 3);
jorge.sumar(200, 350);
	}

}
