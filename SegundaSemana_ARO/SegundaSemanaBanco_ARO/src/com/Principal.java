package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//base de datos
		//crear hash map 
		//declarar hashmap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>(); 
		//ára agregar cuentas en nuestro hash map podemos hacerlo de 2 formas
		//creando la cuenta y agregandla despues 
		Cuenta alex = new Cuenta("alex", 13000, 4000, 50000, "debito");
		cuentas.put(1001, alex);
		//creando las cuentas directamente en el hashmap
		cuentas.put(1002, new Cuenta("berenice", 1000, 100, 15000, "debito"));
		cuentas.put(1003, new Cuenta("humberto", 10000, 1000, 20000, "debito"));
		cuentas.put(1004, new Cuenta("berenice", 500, 100, 10000, "debito"));
		
		//si nos acordamos para recuperar el valor se hacia mediante 
		//System.out.println(cuentas.get(1003));
		
		//crear nuevo cajero
		Cajero angelopolis = new Cajero("angelopolis", cuentas);
		//probar metodo consultar
		System.out.println(angelopolis.consultar(1006));
		//probar el metodo retiro exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 9000));
		
		//quiero retirar dinnero de uan cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 9000));
		
		//probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 11000));
	}

}
