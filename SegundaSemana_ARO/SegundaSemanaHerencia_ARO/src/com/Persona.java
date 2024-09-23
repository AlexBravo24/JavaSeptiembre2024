package com;

public class Persona {
private String nombre;
private String genero;
private int edad;
public Persona () {
	
}
public Persona(String nombre, String genero, int edad) {
	
	this.nombre = nombre;
	this.genero = genero;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

//Metodos propios
//acciones que pueden ejecutar nuestros objetos

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
}
//metodo sin retorno void
//ejecutan sin necesidad de devolver el valor de un tipo de dato
public void comer () {
	System.out.println("Estoy comiendo");
	
}

//metodo con retorno
//debe de retornar el tipo de dato que el metodo declara 
public String saludar () {
	String saludo = "hola buen dia";
	return saludo;
	
	
}
//metodo polimorfico
//el poliformismop es otro pilar de la POO
//se ve mas comunmente en metodos que pueden tener el mismo nombre pero ejecutarse
//de forma distinta
//esto se lleva a cabo gracias a la sobre carga de argumentos que podemos tener 
//sobrecarga de metodos
public void comer(String comida) {
	System.out.println("estoy comiendo " + comida);
	
}
public void comer(String comida, int raciones) {
	System.out.println("estoy comiendo " + raciones + " raciones de " + comida);
	
}
//aprovechando que le estamos heredando esto a empleado
//vamos a declarar un metodo abstracto que solo empleado pueda definir

//un metodo abstracto es aque que nos dice que se va a hacer pero no como
public void trabajar() {
}

}
