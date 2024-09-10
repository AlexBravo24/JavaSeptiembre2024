package com.ciclos;

import java.util.Scanner;

public class Ciclos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int alto;
int base;
Scanner entrada = new Scanner(System.in);
System.out.println("Escribe la base de tu figura:  ");
base = entrada.nextInt();
System.out.println("Escribe la altura de tu figura:  ");
alto = entrada.nextInt();
for (int x = 1; x <= alto;x++) {
	for (int y = 1; y <= base; y++) {
		
	System.out.print("*");
}
	System.out.println("");
}
	}

}
