package com.modelo;

public class Cuenta {
//en el paquete com.modelo guardamos la informacion
//de los objetos o entidades a los cuales queremos acceder
	//en este ejemplo necesitamos crear varias cuentas
	//de usuarios y las agregamos a un hashmap para
	//simular una pequeña bd
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMAX;
	private String tipoCuenta;
	public Cuenta () {}
	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMAX, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMAX = saldoMAX;
		this.tipoCuenta = tipoCuenta;
	}
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
	public double getSaldoMAX() {
		return saldoMAX;
	}
	public void setSaldoMAX(double saldoMAX) {
		this.saldoMAX = saldoMAX;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMAX=" + saldoMAX
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
}
