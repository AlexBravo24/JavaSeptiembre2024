package com;

//Esta va a ser la clase hija y para heredar los atributos
//y m�todos de una Persona se utiliza la palabra reservada extends
public class Empleado extends Persona {

	// Con la HERENCIA podemos "reutilizar" c�digo de la Clase Padre,
	// declarando s�lo aqu� lo propio de la clase empleado
	private String rfc;
	private double salario;
	private String turno;

	public Empleado() {

	}

	// Source + Generate Constructor using Fields + *importante seleccionar todos
	// los atributos en Persona en la barra de arriba*
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

	// M�todo toString: seleccionar solo toString en la secci�n Inherited methods
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	//----------------------------------------------
	
	//M�TODOS PROPIOS
	public void sumar (int a, int b) {
		System.out.println("La suma es: "+ (a+b));
	}

	
	//Aqu� la clase hija debe implementar el m�todo abstracto de la clase Padre
	//y definir C�MO se va a realizar
	@Override
	public void trabajar() {
		System.out.println("Estoy trabajando...");
		
	}
	
	
	

}
