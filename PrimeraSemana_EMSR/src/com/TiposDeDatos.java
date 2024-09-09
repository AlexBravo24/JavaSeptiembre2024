package com; // Nombre del paquete 

public class TiposDeDatos { // Nombre de la clase y apertura
	
 	public static void main (String [] args) { // apertura del main
 		
 		// Comenterios de una sola linea con dos diagonales
 		//Estos comentarios no interfieren con el codigo
 		// o con la ejecucion del ismo
 		//Aqui vamos a escribir nuestro codigo
 		
 		/*Comentarios
 		 * de 
 		 * multiples 
 		 * lineas
 		 *
 		 * 
 		 */
 		
 		/*El metodo main es tambien conocido como metodo principal
 		 * o punto de entrada para la ejecucion de un programa
 		 * clase o logica de algun tipo. si queremos que algo 
 		 * se ejecute debe ir dentro del metodo main
 		 * 
 		 */
 		
 		// Con CTRL + S atajo para guardar cambios de codigo
 		// en las clases
 		
 		/*Tipos de datos en JAVA
 		 * Tipos de datos primitivos
 		 * Numericos enteros
 		 * 
 		 */
 		
 		// Ejemplo de declarar variables con su tipo de dato
 		// pero sin un valor asignado
 		
 		byte numeroByte;
 		
 		// si tengo la necesidad mas adelante de iniciar mi variable
 		// o guardar un valor en ella lo puedo hacer
 		numeroByte = 127;
 		
 		//Ejemplo de declarar variables con su tipo de dato
 		// y valores asignados desde un inicio
 		
 		byte by = -128; // 1 byte de memoria -128 a 127 positivo
 		short sh = -32768; // 2 bytes de memoria -32768 a 32767 positivo
 		int entero = 2147483647; // 4 bytes
 		long largo = 2147483649L; // 8 bytes
 		// los tipos de dato long necesitan el sufijo "L" para admitir
 		// valores que van mas alla del rango de los de tipo int
 		
 		
 		// El tipo de dato mas utilizado para crear valores numericos
 		// enteros es el tipo int
 		
 		/*Tipos de datos primitivos
 		 * Numeros en punto o coma flotante (Decimales)
 		 * 
 		 */
 		
 		float f = 3.1416F; // 4 bytes y necesitan el sufijo F para guardar o
 		// asignar los valores
 		double d = 3.1416;// 8 bytes
 		
 		// El tipo de dato mas utilizado para guardar decimales es el tipo de
 		// dato double
 		
 		/*Tipos de dato primitivos
 		 * Booleanos
 		 * caracter
 		 * 
 		 */
 		
 		boolean flag = false ;
 		
 		// El uso de estos tipos de dato facilita el trabajo al evaluar
 		// expresiones o condiciones. Solo admiten true /false.
 		
 		char caracter = 'a'; // admiten un unico caracter a la vez
 		// y se almacenan en comilla simple
 		
 		/*Tipos de dato estructurados
 		 * tipos de dato objeto
 		 * tipos de dato no primitivos
 		 * son tipos de dato que son clases, son datos mas complejos
 		 * que se componen incluso de varios tipos de dato primitivo
 		 * en algunos casos
 		 * 
 		 * 
 		 */
 		
 		//cadena de texto (string)
 		
String nombre = "Erick manuel Sarmiento Rosas";

        // Los tipos de dato estructurados van a contar con algo llamado
        //metodos o acciones que pueden ejecutar dichas variables
       	nombre.hashCode();
       	
       	// Tipos de dato estructurados - Tipos de dato wrapper/ Envoltorio
       	// Son clases que envuelaven a los primitivos para que estos 
       	//puedan utilizar algunos metodos
       	Byte numero1 = 127;
       	
       	/*Short
       	 * Tnteger
       	 * Long
       	 * Float
       	 * Double
       	 * Boolean
       	 * Charactes
       	 * 
       	 */
       	
 		// salida a lo datos en consola
       	System.out.println("Hola mundo");
       	
       	// Darle salida a los valores almacenados en alguna variable
       	//syso o sout + ctrl + espacio
       	System.out.println(nombre);  
       	
       	// Podemos mandar igual suma de algunos valores directamente en consola
       	// o una suma de algunas variables
       	System.out.println(26+35);
       	
       	int a = 15;
       	int b= 60;
       	
       	System.out.println(a+b);
       	
       	
       	// concatenacion
       	//se unen palabras y operaciones, pero etas ultimas hay que
       	// separarlas
       	System.out.println("El resultado de a+b es : " + (a+b));
       	
       	
 	}// cierre del main
	

}// cierre de la clase
