package com;  //nombre del paquete

public class TiposDeDatos {  //nombre de la clase y apertura

	public static void main(String[] args) { /*apertura del main
		*escribir main, despues control+espacio y pues darle a lo demas 
		*/
		
		/*El metodo main es tambien conocido como metodo principal 
		 * o punto de entrada para la ejecucuion de un programa
		 * clase o logica de algun tipo. Si queremos que algo 
		 * se ejecute debe de ir dentro del metodo main
		 */
		
		byte numeroByte;
		
		numeroByte = 127; 
		
		byte by = -128; //1 byte de memoria -128 a 127 positivo
		short sh = -32768; //2 bytes de memoria -32768 a 32767 
		int entero = 2147483647; //4 bytes
		long largo = 2147483649L; //8 bytes y este tipo de dato necesita 
		                          //sufijo "L" para admitir al final.
		
		//Tipos de datos primitivos
		float f = 3.1416f; //4 bytes y necesitan el sufijo "f"  para guardar o asignar valores
		double d = 3.1415; //8 bytes 
		
		//el tipo de dato mas utilizado para guardar decimales es el tipo de dato double
		
	
		boolean flag = false; //el uso de este tipo de datos facilita el trabajo a evaluar 
		                      //expresiones o condiciones. solo admiten true/false
		char caracter = '$'; //admiten un unico caracter a la vez y se alamacenan en comilla simple 
		
	
		/*Tipos de datos estructurados
		 * tipos de dato objeto
		 * tipos de dato no primitivos
		 * son tipos de datos que son clases, son datos mas complejos 
		 * que se componen incluso de varios tipos de dato primitivo en algunos casos
		 */
		
		//cadena de texto (String)
		String nombre = "Jesus Narciso Castillo Aguilar";
				
		//Los tipos de satos estructurados van a contact con algo llamado 
		//metodos o acciones que puede ejecutar dichas variables 
		nombre.hashCode();
		
		//Tipos de dato structurado - tipos de dato wrapper/envoltorio
		//son clases que envuelven a los primitivos para que estos puedan utilizar algunos metodos
		Byte numero1 = 127;
		
		/*Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Boolean
		 * Character
		 */
		
		//Para darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//darle salida a valores almacenados en alguna variable
		//syso o sout + CTRL + espacio
		System.out.println(nombre);
		
		int a = 77;
		int b = 33;		
		System.out.println("El resultado de a+b es:" + (a+b));
		
	}  //cierre del main
	
	
}//cierre de la clase
