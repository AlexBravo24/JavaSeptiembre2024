package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	private int folio = 1;

	public Cajero() {}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta Consultar(int numeroCuenta) 
	{
		Cuenta cuenta = null;
		cuenta =  cuentas.get(numeroCuenta);
		return cuenta;
		
	}

	@Override
	public Ticket Retirar(int numeroCuenta, double monto) {
		Ticket ticket  = null;
		if(Consultar(numeroCuenta) != null)
		{
			Cuenta cuenta = Consultar(numeroCuenta);
			if(monto > 9000)
			{
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			}
			else if(cuenta.getSaldo() < monto)
			{
				System.out.println("Saldo Insuficiente");
				return ticket;
			}
			else if (cuenta.getSaldo()-monto <cuenta.getSaldoMin())
			{
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;				
			}
			else
			{
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++,new Date(),cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				return ticket;
			}
		}
		else
		{
			System.out.println("No exite un cliente");
			return ticket;
		}
		

	}

	@Override
	public Ticket Depositar(int numeroCuenta, double monto) {
		
		Ticket ticket = null;
		if(Consultar(numeroCuenta) != null)
		{
			Cuenta cuenta = Consultar(numeroCuenta);
			if(monto> cuenta.getSaldoMax())
			{
				System.out.println("Excede el saldo maximo");
				return ticket;
			}
			else if (cuenta.getSaldo()+ monto > cuenta.getSaldoMax())
			{
				System.out.println("Excede el saldo maximo permitido por la cuenta");
				return ticket;
			}
			else
			{
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++,new Date(),cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				return ticket;
			}
		}
		else
		{
			System.out.println("No hay cuenta con ese cliente");
			return ticket;
		}
		
	}

}
