package com;

//Clase padre 
public abstract class Persona 
{
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona(String nombre, String genero, int edad)
	{
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	public void Comer()
	{
		System.out.println("Ya comi");
	}
	public void Comer(String comida)
	{
		System.out.println("Ya comi " + comida);
	}
	public void Comer(String comida, int raciones)
	{
		System.out.println("Ya comi "+raciones +" "+ comida);
	}
	//Declaracion de metodo abstracto
	public abstract void trabajar();
	public String Saludar(String saludo)
	{
		String _saludo;
		_saludo = saludo;
		return _saludo;
	}
}
