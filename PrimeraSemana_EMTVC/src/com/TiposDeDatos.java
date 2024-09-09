package com;

public class TiposDeDatos { //nombre de la clase y apertura

	@SuppressWarnings("unused")
	public static void main(String[] args) { //apertura del main
		
		//Comentarios de una sola linea con dos diagonales
		//Estos comentarios no interfieren con el codigo
		//o con la ejecucion del mismo
		//aqui vamos a escribir nuestro codigo
		
		/*
		 *Comentarios
		 *de
		 *multiples
		 *lineas
		 */
		
		/*El metodo main es tambien conocido como metodo principal
		 * o punto de entrada para la ejecucion de un programa
		 * clase o logicade algun tipo, Si queremos que algo 
		 * se ejecute debe ir dentro del metodo main
		 * 
		 */
		
		//Con CTRL+S atajo para guardar cambios de codigo en
		//las clases
		
		/* TIPOS DE DATOS EN JAVA
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS ENTEROS
		 * 
		 */
		
		//Ejemplo de declarar variables con su tipo de dato
		//pero sin un valor asignado
		byte numeroByte;
		
		//Si tengo la necesidad mas adelante de iniciar mi variable
		//o guardar un valor en ella lo puedo hacer
		numeroByte = 127;
		
		//Ejemplo de declarar variables con su tipo de datos
		//y valores asignados desde un inicio
		byte by = -128; //1 byte de memoria -128 a 127 positivo
		short sh =-32768; //2 bytes de memoria -32768 a 32767
		int entero = 2147483647; //4 bytes de memoria
		long largo= 2147483649L; //8 bytes
		//Los tipos de dato long necesitan el sufijo "L" para admitir
		//vaores que van mas alla del rango de los tipo int
		
		//El tipo de dato mas utilizado para crear valores numericos
		//enteros es el tipo int
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMA FLOTANTE(Decimales)
		 * 
		 */
		
		float f= 3.1416F; //4 bytes y necesitan el sufijo "F" para guardar
		//o asignar los valores
		double d = 3.1416; //9 bytes
		
		//El tipo de dato mas utilizado para guardar decimales es el tipo de
		//dato double
		
		/*TIPOS DE DATO PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 * 
		 */
		
		boolean flag = false;
		//El uso de estos tipos de dato facilita el trabajo al evaluar
		//expresiones o condiciones. Solo admiten true/false.
		
		char caracter = 'a'; //admiten un unico caracter a la vez
		//y se almacenan en comilla simple
		
		
		/* TIPOS DE DATO ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO NO PRIMITIVO
		 * Son tipos de datos que son clases, son datos mas complejos
		 * que se componen incluso de varios tipos de dato primitivo
		 * en algunos casos
		 * 
		 */
		
		//Cadena de Texto (String)
		String nombre= "Ejemer Marco Tulio Vargas Cabrera";
		
		//Los tipos de datos estructurados van a contar con algo llamado
		//metodos o acciones que pueden ejecutar dichas variables
		nombre.hashCode();
		
		//Tipos de dato Estructurados - Tipos de datos Wrapper/Envoltorio
		//Son clases que envuelven a los primitivos para que estos 
		//puedan utilizar algunos metodos
		Byte numero1 = 127;
		
		//Short
		//Integer
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//Salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Darle salida a los valores almacenados en alguna variable
		// syso o sout + CTRL + espacio
		System.out.println(nombre);
		
		//Podemos mandar igual suma de algunos valores directamente en consola
		//o una suma de algunas variables
		System.out.println(20+35);
		
		int a =15;
		int b = 60;
		
		System.out.println(a+b);
		
		//Concatenacion
		//Se unen palabras y operaciones pero estas ultimas hay que
		//separarlas
		System.out.println("El resultado de a + b es: " + (a+b));
		
		
		
		
		
	}//cierre del main
}

