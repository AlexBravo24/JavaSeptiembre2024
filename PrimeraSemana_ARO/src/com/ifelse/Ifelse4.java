package com.ifelse;

import java.util.Scanner;

public class Ifelse4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String valorInstroducido;
Scanner entrada = new Scanner(System.in);   
System.out.println("Escribe una frase");
valorInstroducido = entrada.next();
String letrasMin = valorInstroducido.toLowerCase(); 
if (valorInstroducido.equals(letrasMin))
{
	System.out.println("no contiene minusculas");
	}
else
{
	System.out.println("contiene mayusculas");
}
}
}

