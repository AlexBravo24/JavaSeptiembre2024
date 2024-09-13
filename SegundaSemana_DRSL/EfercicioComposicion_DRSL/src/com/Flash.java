package com;

public class Flash 
{
	private float intensidad;
	private String color;
	public Flash(float intensidad, String color) 
	{
		super();
		this.intensidad = intensidad;
		this.color = color;
	}
	public float getIntensidad() {
		return intensidad;
	}
	public void setIntensidad(float intensidad) 
	{
		this.intensidad = intensidad;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	@Override
	public String toString() 
	{
		return "Flash [intensidad=" + intensidad + ", color=" + color + "]";
	}
	
}

