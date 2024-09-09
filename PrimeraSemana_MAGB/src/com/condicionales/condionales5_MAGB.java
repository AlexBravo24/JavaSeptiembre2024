package com.condicionales;

import java.util.Scanner;


public class condionales5_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.  
				//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
				//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
				//* Otros casos -> NO ACEPTADA
				
				int edad;
				int nota;
				String sexo;
				Scanner dato = new Scanner(System.in);
				
				System.out.println("Por favor, ingrese su edad:");
				edad=dato.nextInt();
				System.out.println("Por favor, ingrese su nota:");
				nota=dato.nextInt();
				System.out.println("Por favor, ingrese su sexo:");
				sexo=dato.next();
				
				if(edad>17) {
					if(nota>4) {
						if(sexo.equals("M")) {
							System.out.println("POSIBLE");
						}else {
							if(sexo.equals("F")) {
								System.out.println("ACEPTADA");
							}else {
								System.out.println("NO ACEPTADA");
							}
						}
					}else {
						System.out.println("NO ACEPTADA");
					}
				}else {
					System.out.println("NO ACEPTADA");
				}
				
				dato.close();
	}

}
