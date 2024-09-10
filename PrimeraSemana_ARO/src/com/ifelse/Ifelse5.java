package com.ifelse;

import java.util.Scanner;

public class Ifelse5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nota;
int edad;
String sexo;
Scanner entrada = new Scanner(System.in);           
System.out.println("Escribe la nota del alumno");      
nota = entrada.nextInt();                         
System.out.println("Escribe la edad del alumno");     
edad = entrada.nextInt(); 
System.out.println("escribe el sexo del alumno (M/F)");
sexo = entrada.next(); 
if (nota>5 && edad>18 && sexo.equals("M"))
{ 
	System.out.println("Posible candidato");
}
else if (nota>5 && edad>18 && sexo.equals("F")) {
	System.out.println("Felicidades has sido aceptado");
}
else {
	System.out.println("no eres aceptado");
}
	}

}
