package com.servicio;
import com.modelo.Cuenta;
import com.respuesta.Ticket;
public interface IMetodos 
{
	public Cuenta Consultar(int numeroCuenta);
	public Ticket Retirar(int numeroCuenta , double monto);
	public Ticket Depositar(int numeroCuenta , double monto);
}
