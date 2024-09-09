package com.ciclos;

public class Ciclos11_DRSL {

	public static void main(String[] args) {
		String characterShape="";
		
		for(int i = 0; i < 8 ; i++)
		{
			if(i!=0)
			characterShape +="\n";
			for(int j = 0; j < 8 ; j++)
			{
				characterShape += " *";
			}
		}
			System.out.println(characterShape);
	}
}
