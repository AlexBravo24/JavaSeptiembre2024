package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
//en el paquete com.logica se encuentra la clase
	//encargada de resolver las operaciones
	//vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	//Declarar una variable axuliar para incrementar el folio en ticket
	private int folio=1;
	public Cajero() {}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	public Cuenta consultar(int numeroCuenta) {
		// necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		//asignamos posteriormente en elhashmap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
//ir a consultar para verificar la cuenta
		//realizar validaciones
		//si se encuentra o localiza la cuenta la asignamos
		//para manipularla
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez que localizamos la cuenta a manipular
			//realizamos operaciones
			if (monto>9000) {
				System.out.println("el monto excede el monto permitido popr el cajero");
				return ticket;
			}
			else if (cuenta.getSaldo()<monto) {
				System.out.println("no tienes suficiente saldo");
				return ticket;
				
			}
			else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("el retiro dejaria por debajo del minimo");
				return ticket;
			}
			else {
				//si el retiro puede realizarse
				//actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//realizamos retiro
				//entonces emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
			
			}
		else {
			System.out.println("no existe una cuenta asocida al cliente");
		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if (consultar(numeroCuenta) !=null){
			Cuenta cuenta = consultar(numeroCuenta);
			//validaciones
			if(monto>cuenta.getSaldoMAX()) {
				System.out.println("el monto excede el maximo opermitido en la cuenta");
				return ticket;
			}
				else if (cuenta.getSaldo()+monto>cuenta.getSaldoMAX()) {
					System.out.println("el saldo excederia el maximo de tu cuenta");
					return ticket;
				}
				else {
					cuenta.setSaldo(cuenta.getSaldo()+monto);
					ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
					return ticket;
				}}
			else {
				System.out.println("no hay una cuenta asociada");
				return ticket;
				
			}
	
	
	}

}
