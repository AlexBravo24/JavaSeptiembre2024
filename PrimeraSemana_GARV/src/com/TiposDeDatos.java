package com;//Nombre del paquete

public class TiposDeDatos { //Nombre de la clase y apertura

	@SuppressWarnings("unused")
	//Este comando omite las advertencias del programa
	
	public static void main(String[] args) { //apertura del main
		//Comentario de una sola linea 
		
		/*comentario
		 * de
		 * multiples
		 * lineas
		 */
		
		/*El metodo main es conocido tambi�n como m�todo principal 
		 * o punto de entrada para la ejecuci�n de un programa
		 * clase o l�gica de alg�n tipo. Si queremos que algo
		 * se ejecute debe ir dentro del m�todo main
		 */
		
		//con CTRL + S se guardan los cambios
		/*TIPOS DE DATOS EN JAVA
		 * TIPOS DE DATOS PRIMITIVOS
		 * NUM�RICOS ENTEROS
		 */
		//Ejemplo de declarar variables con su tipo de dato
		//pero sin valor asignado
		byte numeroByte;
		
		//Si tengo la necesidad de iniciar mi variable o guardar un
		//valor se puede hacer m�s adelante
		numeroByte=127;
		
		//ejemplo de declarar variables con su tipo de dato
		//y valores asignados desde un inicio
		byte by = -128;  //Utilizan 1 byte de memoria entre -128 a 127
		short sh = -32768; //2 bytes de memoria, va desde -32768 a 32768
		int entero=2147483647; //4 bytes de memoria.
		long largo=2147483649L; //8 bytes
		//los tipos de dato long necesitan el sufijo "L" para admitir
		//valores que van m�s all� de los tipo int.
		
		//El tipo de dato m�s utilizado para valores num�ricos enteros
		//es el tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUM�RICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 */
		
		float f=3.1416F; //utilizan 4 bytes y necesitan el sufijo F para
		//asignar los valores
		double d=3.1416;//8 bytes y no requiere sufijo
		
		//el tipo de dato m�s utilizado para guardar decimales es el de
		//tipo double.
		
		/*TIPOS DE DATO PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean flag=false;
		//El uso de estos tipos de datos facilita el trabajo al evaluar
		//expresiones o condiciones. S�lo admite "true o false"
		
		char caracter='$'; //admiten un �nico caracter a la vez.
		//se almacena utilizando la comilla simple.
		
		/*TIPOS DE DATO ESTRUCTURADOS
		 * TIPOS DE DATO OBJETOS
		 * TIPOS DE DATO NO PRIMITIVOS
		 * Son tipos de datos que son clases, son m�s complejos y se
		 * compone de varios datos primitivos en ciertos casos
		 */
		
		//cadena de texto (string)
		String nombre="Gerardo Adri�n Ruiz Villa";
		
		//Los tipos de datos estructurados van a contar con algo llamado
		//m�todos o acciones que pueden ejecutar dichas varialbes
		nombre.hashCode() ;
		
		//Tipos de dato estructurados - Tipos de dato Wrapper/envoltorio
		//son tipos de clase que envuelve a los primitivos para que
		//estos puedan utilizar algunos m�todos.
		Byte numero1=127;
		
		//Short
		//Integer
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//Salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Darle salida a los valores almacenaos en alguna variable
		//syso o sout + CTRL + espacio
		System.out.println(nombre);
		
		//Podemos mandar suma de algunos valores directamente a la consola
		//o una suma de algunas variables
		
		System.out.println(20+35);
		
		int a = 15;
		int b = 60;
		System.out.println(a+b);
		
		//Concatenacion
		//Se unen palabras y operaciones, pero estas �ltimas hay que separarlas
		System.out.println("El resultado de a + b es: "+ (a+b));
		
		
	}//Cierre del main
	
	
	
}//Cierre de la clase