package com.ifelse;

import java.util.Scanner;

public class Ifelse8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int diaSemana;
Scanner entrada = new Scanner(System.in);
System.out.println("Escribe un numero de 1 a 7 ");
diaSemana = entrada.nextInt();
switch (diaSemana) {
case 1:
System.out.println("Lunes");
break;
case 2:
System.out.println("Martes");
break;

case 3:
System.out.println("Miercoles");
break;

case 4:
System.out.println("Jueves");
break;
case 5:
System.out.println("Viernes");
break;
case 6:
System.out.println("sabado");
break;
case 7:
System.out.println("Domingo");
break;
default:
	System.out.println("El numero es incorrecto");
	}

	}}
