package com;

public class Empleado extends Persona
{
	private String rfc;
	private double salario;
	String turno;
	
 public Empleado()
 {
	 
 }

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
public void sumar (int a , int b)
{
	System.out.println(a+b);
}

@Override
public void trabajar() 
{
	System.out.println("Estoy trabajando");
}
 
}
