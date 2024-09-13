package com.modelo;

public class Cuenta {

	// En el paqueto com.modelo guardamos la info de los objetos
	// o entidades a los cuales queremos acceder
	// En este ejemplo necesitamos crear varias cuentas de usuarios
	// y las agregaremos a un HashMap para simular una peque�a BD
	// (Base de Datos)
	
	private String usuario; 
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	//Constructor vac�o
	public Cuenta () {
	}

	//Constructor con todos los para�metros
	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
	}

	//Getters and Setters
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	//M�todo String
	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
