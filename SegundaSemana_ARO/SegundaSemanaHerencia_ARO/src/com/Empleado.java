package com;
//esta va a ser la claase hija para heredar 
	//los atributos y metodos de una persona utiliza
	//la palabrareservada extends
public class Empleado extends Persona{
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	//con la herencia podemos reutilizar el codigo de la clase padre
	//declarando solo aqui lo propio del empleado
	private String rfc;
	private double salario;
	private String turno;
	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
		
	}
	
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	public void sumar (int a, int b) {
		System.out.println("la suma es " + (a + b));
	}
}
