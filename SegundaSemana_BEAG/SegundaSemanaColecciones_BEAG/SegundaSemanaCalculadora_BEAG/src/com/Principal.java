package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calculadora = new Cientifica("Casio", "Negra", 2019);
		
        System.out.println(calculadora);
    
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Leer el primer número
        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();
        
        // Leer el segundo número
        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();
        
        // Realizar operaciones básicas
        calculadora.sumar(num1, num2);
        calculadora.restar(num1, num2);
        calculadora.multiplicar(num1, num2);
        calculadora.dividir(num1, num2);
        
        // Leer el tercer número
        System.out.print("\nIngrese el tercer número: ");
        double num3 = entrada.nextDouble();
        
        // Realizar operaciones con tres números
        calculadora.sumar(num1, num2, num3);
        calculadora.restar(num1, num2, num3);
        calculadora.multiplicar(num1, num2, num3);
        calculadora.dividir(num1, num2, num3);
        
	}
}
