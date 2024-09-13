package com;
import java.util.Scanner;

public class PrincipalCalculadora {

	public static void main(String[] args) {
		Cientifica calculadora = new Cientifica();
		float a;
		float b;
		float c;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el primer valor");
		a = input.nextFloat();
		System.out.println("Ingresa el segundo valor");
		b = input.nextFloat();
	
		System.out.println("SUMA = "+ calculadora.Sumar(a, b));
		System.out.println("RESTA = "+calculadora.Restar(a, b));
		System.out.println("MULTIPLICACION = "+calculadora.Multiplicar(a, b));
		System.out.println("DIVISION = "+ calculadora.Dividir(a, b));
		
		System.out.println("Ingresa el tercer valor");
		c = input.nextFloat();
		
		System.out.println("SUMA = "+ calculadora.Sumar(a, b,c));
		System.out.println("RESTA = "+calculadora.Restar(a, b,c));
		System.out.println("MULTIPLICACION = "+calculadora.Multiplicar(a, b,c));
		System.out.println("DIVISION = "+ calculadora.Dividir(a, b,c));
	}

}
