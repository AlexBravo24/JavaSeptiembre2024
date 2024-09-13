package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) 
	{
		String linea;
			try 
			{
				File archivo = new File("C:\\Users\\PUERTO\\Desktop\\Ceteq\\archivosFR\\fichero.txt");
				FileReader fr = new FileReader(archivo);
				BufferedReader buffer = new BufferedReader(fr);
				
				while((linea = buffer.readLine()) != null) // LEE MUCHAS LINEAS DESPUES DEL ESPACIO.
				{
					System.out.println(linea);
				}
								
			} 
			catch (Exception e) 
			{				
				e.printStackTrace();
				System.out.println("EXCEPCION!");
			}
	}
			
}
