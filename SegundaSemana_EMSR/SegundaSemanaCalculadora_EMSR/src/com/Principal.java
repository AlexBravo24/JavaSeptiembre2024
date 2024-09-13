package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Cuando tengo una clase que hereda de otra, posiblemente
		//solo me interese que defina los metodos y utilizarlos inmediata mente
		
		Cientifica casio= new Cientifica();
		
		casio.sumar(10, 11);
		
		
		Cientifica resultado = new Cientifica("Casio","negra","solar");
		
		float numero1;
		float numero2;
		float a;
		float b;
		float c;
		
        Scanner entrada = new Scanner(System.in ); 
        
        System.out.println(resultado);
		
		System.out.println("Selecciona la operacion (1. Suma, 2. Resta, 3. Multiplicacion,4. division ");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el numero de elementos. 2 o 3");
		numero2 = entrada.nextInt();
		
		if (numero1==1 && numero2==2) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			resultado.sumar(a, b);
			
		} else if (numero1==2 && numero2==2) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			resultado.restar(a, b);
			
		} else if (numero1==3 && numero2==2) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			resultado.multiplicar(a, b);
			
		}else if (numero1==4 && numero2==2) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			resultado.dividir(a, b);
			
		} else if (numero1==1 && numero2==3) { // con tres elementos
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			System.out.println("El tercer numero");
			c = entrada.nextInt();
			
			resultado.sumar(a, b, c);
			
		} else if (numero1==2 && numero2==3) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			System.out.println("El tercer numero");
			c = entrada.nextInt();
			
			resultado.restar(a, b, c);
			
		}else if (numero1==3 && numero2==3) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			System.out.println("El tercer numero");
			c = entrada.nextInt();
			
			resultado.multiplicar(a, b, c);
			
		} else if (numero1==4 && numero2==3) {
			System.out.println("Ingresa el primer numero ");
			a = entrada.nextInt();
			
			System.out.println("El segundo numero");
			b = entrada.nextInt();
			
			System.out.println("El tercer numero");
			c = entrada.nextInt();
			
			resultado.dividir(a, b, c);
			
		} 
		
		
		
//		resultado.sumar(1, 2);
//		
//		resultado.dividir(4, 2);
//		
//		resultado.restar(3, 2);
//		
//		resultado.multiplicar(2, 3);
//		
//		resultado.restar(4, 3, 1);
//		
//		resultado.sumar(1, 2, 3);
//		
//		resultado.multiplicar(3, 2, 4);
//				
//		resultado.dividir(20, 2, 5);
//		
		
	}

}
