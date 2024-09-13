package com;

//Esta va a ser la clase hija y para heredar
//los atributos y metodos de una Persona se utiliza 
//la palabra reservada extends
public class Empleado extends Persona {

	//Con la HERENCIA podemos "reutilizar" codigo
	//de la clase padre, declarando solo aqui lo propio de
	//la clase empleado
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

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
	
	
	//METODOS PROPIOS
	
	public void sumar (int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}

	//Aqui la clase hija debe implementar el metodo abtracto de la clase Padre
	//y definir COMO se va a realizar
	@Override
	public void trabajar() {
		
		System.out.println("Estoy trabajando...");
		
	}
}
