package com.principal;


import java.util.HashMap;
import java.util.Map;


import com.logica.MaquinaExpendedora;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		

		cuentas.put(1002, new Cuenta("Papas", 50, "Efectivo", 0));
		cuentas.put(1003, new Cuenta("Galletas", 70, "Efectivo", 0));
		cuentas.put(1004, new Cuenta("Tortillas", 90, "Efectivo", 0));
		
		//Cuenta angelopolis = new Cuenta();
		System.out.println(cuentas.get(1003));
		
		MaquinaExpendedora angelopolis = new MaquinaExpendedora("Angelopolis",  cuentas);
		
		System.out.println(angelopolis.consultar(1005));
		
//		System.out.println(angelopolis.retirar(1004, 80));
//		
		System.out.println(angelopolis.depositar(1002, 10));
		System.out.println(angelopolis.depositar(1002, 20));
		System.out.println(angelopolis.depositar(1002, 10));
		System.out.println(angelopolis.depositar(1002, 10));
		System.out.println(angelopolis.depositar(1002, 10));
		
		System.out.println(angelopolis.depositar(1001, 10));
		
	}

}
