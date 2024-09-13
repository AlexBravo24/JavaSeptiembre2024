package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a crear nuestra base de datos: HashMAp
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Para agregar Cuentas a nuestro HashMap, podemos hacerlo de dos formas:
		//1. Creando la cuenta y agreg�ndola despu�s
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "D�bito");
		//Agregarlo al HashMap
		cuentas.put(1001, alex);
		
		//2. Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "D�bito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "D�bito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "D�bito"));
		
		//Si nos acordamos, para recuperar el valor de un obketo en mi HashMap
		// System.out.println(cuentas.get(1003)); //Lo tiene que hacer la clase Cajero
		
		//Crear mi nuevo Cajero, pero previamente me tengo que ir a la clase Cajero
		// y en:
		//@Override
		//public Cuenta "CONSULTAR" (int numeroCuenta) {
		//Escribirmos:
		// Cuenta cuenta = null;
		// return cuenta;
		//LISTO!, ahora en Principal, escribrimos aqu�:
		Cajero angelopolis = new Cajero("Angel�polis", cuentas);

		// Probar el m�todo consultar
		System.out.println(angelopolis.consultar(1006));
		
		//Probar el m�todo retirar
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		//Quiero retirar dinero de una cuenta que no tiene saldo suficiente
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Probar el m�todo depositar exitoso
		System.out.println(angelopolis.despositar(1001, 5000));
		System.out.println(angelopolis.despositar(1003, 10000));
		
		//Probar el m�todo depositar a una cuenta que excede el monto m�ximo
		System.out.println(angelopolis.despositar(1003, 100));

	}

}
