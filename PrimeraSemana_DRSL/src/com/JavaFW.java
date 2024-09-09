package com;
import  java.io.File;
import  java.io.FileWriter;
public class JavaFW {

	public static void main(String[] args) {
		
		String word =  "\n Hola Generacion 166";
		try 
		{
			File archive = new File("C:\\Users\\PUERTO\\Desktop\\Ceteq\\archivosFR\\fichero.txt");
			FileWriter line = new FileWriter(archive , true);
			line.write(word);
			line.close();
			System.out.println("Linea escrita correctamente!");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
