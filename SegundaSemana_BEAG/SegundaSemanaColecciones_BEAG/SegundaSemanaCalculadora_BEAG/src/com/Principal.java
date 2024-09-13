package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calculadora = new Cientifica("Casio", "Negra", 2019);
		
        System.out.println(calculadora);
    
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Leer el primer n�mero
        System.out.print("Ingrese el primer n�mero: ");
        double num1 = entrada.nextDouble();
        
        // Leer el segundo n�mero
        System.out.print("Ingrese el segundo n�mero: ");
        double num2 = entrada.nextDouble();
        
        // Realizar operaciones b�sicas
        calculadora.sumar(num1, num2);
        calculadora.restar(num1, num2);
        calculadora.multiplicar(num1, num2);
        calculadora.dividir(num1, num2);
        
        // Leer el tercer n�mero
        System.out.print("\nIngrese el tercer n�mero: ");
        double num3 = entrada.nextDouble();
        
        // Realizar operaciones con tres n�meros
        calculadora.sumar(num1, num2, num3);
        calculadora.restar(num1, num2, num3);
        calculadora.multiplicar(num1, num2, num3);
        calculadora.dividir(num1, num2, num3);
        
	}
}
