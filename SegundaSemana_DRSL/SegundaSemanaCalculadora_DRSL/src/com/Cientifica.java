package com;

public class Cientifica extends Calculadora  implements ITermometro
{
	private boolean radDeg;
    public Cientifica()
    {
    	
    }
    
	public Cientifica(String marca, String material, String color, boolean radDeg) {
		super(marca, material, color);
		this.radDeg = radDeg;
	}
	@Override
	public void tomarTemperatura()
	{
		
	}
	@Override
	public float Sumar(float a, float b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public float Restar(float a, float b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public float Multiplicar(float a, float b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float Dividir(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	
	public float Sumar(float a, float b , float c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	
	public float Restar(float a, float b , float c) {
		// TODO Auto-generated method stub
		return a-b-c;
	}

	
	public float Multiplicar(float a, float b , float c) {
		// TODO Auto-generated method stub
		return a*b*c;
	}

	
	public float Dividir(float a, float b , float c) {
		// TODO Auto-generated method stub
		return (a/b)/c;
	}
}
