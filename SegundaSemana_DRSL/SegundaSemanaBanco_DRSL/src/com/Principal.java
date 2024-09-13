package com;

import java.util.*;

import com.modelo.Cuenta;
import com.logica.Cajero;
public class Principal 
{

	public static void main(String[] args) 
	{
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		Cuenta cuentaAlex = new Cuenta("Alex",13000,4000,50000,"Debito");
		cuentas.put(1001, cuentaAlex);
		cuentas.put(1002, new Cuenta("Berenice",1000,100,15000,"Debito"));
		cuentas.put(1003, new Cuenta("Jorge",10000,20000,15000,"Debito"));
		cuentas.put(1004, new Cuenta("Humberto",12000,100,15000,"Debito"));
		
		Cajero cajero = new Cajero("Angelopolis",cuentas);
		
		//System.out.println(cajero.Consultar(1002));
		
//		System.out.println(cajero.Retirar(1001, 1000));
//		System.out.println(cajero.Retirar(1001, 15000));
//		System.out.println(cajero.Retirar(1020, 15000));
		
		
	System.out.println(cajero.Depositar(1001, 2000));
	
	}

}
