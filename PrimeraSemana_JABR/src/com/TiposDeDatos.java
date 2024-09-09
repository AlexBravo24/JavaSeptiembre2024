package com; //Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y apertura
	
	@SuppressWarnings("unused")
	public static void main(String[] args) { //apertura del main
		
		//Comentarios de una sola linea con dos diagonales
		//Estos comentarios no interfieren con el código
		//o con la ejecución del mismo
		//Aqui vamos a escribir nuestro codigo
		
		/*
		 * Comentarios
		 * de
		 * multiples
		 * lineas
		 */
		
		/*El método main es también conocido como método principal
		 * o punto de entrada para la ejecución de un programa
		 * clase o lógica de algun tipo. Si queremos que algo
		 * se ejecute debe ir dentro del método main
		 *       
		 */
		
		//Con CTRL + S atajo para guardar cambios de código en 
		//las clases
		
		/*TIPOS DE DATOS EN JAVA
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS
		 * 
		 */
		
		//Ejemplo de declarar variables con su tipo de dato
		//pero sin un valor asignado
		byte numeroByte;
		
		//Si tengo la necesidad más adelante de iniciar mi variable
		//o guardar un valor en ella lo puedo hacer
		numeroByte = 127;
		
		//Ejemplo de declarar variables con su tipo de dato
		//y valores asignados desde un inicio
		byte by = -128; //1 byte de memoria -128 a 127 positivo
		short sh = -32768; //2 bytes de memoria -32768 a 32767 positivo
		int entero = 2147483647; //4 bytes
		long largo = 2147483649L; //8 bytes
		//los tipos de dato long necesitan el sujifo "L" para admitir
		//valores que van más allá del rango de los de tipo int
		
		//El tipo de dato más utilizado para crear valores numéricos 
		//enteros es el tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 * 
		 */
		
		float f = 3.1416F; //4 bytes y necesitan el sufijo F para guardar
		//o asignar los valores
		double d = 3.1416;// 8 bytes
		
		//El tipo de dato más utilizado para guardar decimales es el tipo de
		//dato double
		
		/*TIPOS DE DATO PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 * 
		 */
		
		boolean flag = false; 
		//El uso de estos tipos de dato facilita el trabajo al evaluar
		//expresiones o condiciones. Solo admiten true /false.
		
		char caracter = 'a'; //admiten un único caracter a la vez
		//y se almacenan en comilla simple
		
		
		/*TIPOS DE DATO ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO NO PRIMITIVOS
		 * Son tipos de dato que son clases, son datos más complejos
		 *que se componen incluso de varios tipos de dato primitivo
		 *en algunos casos
		 * 
		 */
		
		//Cadena de Texto (String)
		String nombre = "Jorge Alejandro Bravo Ramirez";
		
		//Los tipos de dato estructurados van a contar con algo llamado
		//métodos o acciones que pueden ejecutar dichas variables
		nombre.hashCode();
		
		//Tipos de dato Estructurados - Tipos de dato Wrapper/Envoltorio
		//Son clases que envuelven a los primitivos para que estos
		//puedan utilizar algunos métodos
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
		//syso o sout + CTRL + espacio
		System.out.println(nombre);
		
		//Podemos mandar igual suma de algunos valores directamente en consola
		//o una suma de algunas variables
		System.out.println(20+35);
		
		int a = 15;
		int b = 60;
		
		System.out.println(a+b);
		
		//Concatenacion
		//Se unen palabras y operaciones, pero estas ultimas hay que
		//separarlas
		System.out.println("El resultado de a + b es: " + (a+b));
		
		
		
	} //Cierre del main
	

}//Cierre de la clase
