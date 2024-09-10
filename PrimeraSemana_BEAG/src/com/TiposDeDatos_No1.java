package com; //Nombre del paquete

public class TiposDeDatos_No1 { //Nombre de la clase y apertura
	
	public static void main(String[] args) { //apertura del main
		
		//Aqui vamos a escribir nuestro codigo
		/*El m�todo main es tambi�n conocido como metodo principal o punto de 
		 * entrada para la ejecucion de un programa clase o logica de algun tipo.
		 * Si queremos que algo se ejecute debe ir dentro del m�todo main*/
		
		/*TIPOS DE DATOS EN JAVA
		 * TIPOS DE DATOS PRIMITIVOS
		 * N�MEROS ENTEROS
		 */
		
		//Ejemplo de declarar varibales con su tipo de dato pero sin un valor asignado
		byte numeroByte;
		
		//Si tengo la necesidad m�s adelante de iniciar mi variable o guardar un valor en ella lo puedo hacer
		numeroByte = 127;
		
		//ejemplo de declarar variables con su tipo de dato y valores asignados desde un inicio
		
		byte by = -128; //1 byte de memoria -128 a 127 positivo
		short sh = -32768; //2 bytes de memoria -32768 a 32767 
		int entero = 2147483647; //4 bytes de memoria, el INT ES EL M�S USADO
		long largo = 2147483649L; 
		//los tipos de dato long necesitan el sufijo "L" para admitir valores que van m�s all� del rango de los tipo int
		
		//EL TIPO DE DATO M�S UTILIZADO PARA CREAR VALORES NUM�RICOS ENTEROS ES EL TIPO "INT"
		
		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUM�RICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		 */
		
		float f = 3.1416f; //4 bytes y requiere el sufijo de la letra "f" para guardar o asignar los valores
		double d = 3.1416; //8 bytes y no requiere de alg�n sufijo
		
		//EL TIPO DE DATO M�S UTILIZADO PARA GUARDAR DECIMALES ES EL TIPO DE DATO "DOUBLE"
		
		
		
		/*TIPOS DE DATO PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean flag = true; //solo admite True o False
		//El uso de estos tipos de dato facilita el trabajo al evaluar expresiones o condiciones
		
		char caracter = '$'; //solo se puede almacenar un unico caracter a la vez
		//Pueden ser: numero, signo o incluso dar el espacio
		//Se debe de poner en comilla simple
		
		
		/*TIPOS DE DATO ESTRUCTURADOS
		 * O conocido como: 
		 * TIPOS DE DATO OBJETIVO
		 * TIPOS DE DATO NO PRIMITIVO
		 * Son tipos de dato que son calses, son datos m�s complejos que se componen incluso de varios tipo de dato primitivo en algunos casos
		 */
		
		//Cadena de Texto (String)
		String nombre = "Brenda Elizabeth Aguirre";
		//Las cadenas de texto van entre comillas
		//Permiten almacenar varios caracteres a la vez, lo que no puede hacer char
		
		//Los tipos de dato estructurado van a contar con algo llamado m�todos o acciones que pueden ejecutar dichas variables
		nombre.hashCode();
		
		//Tipios de dato Estructurados - Tipos de dato Wrapper/Envoltorio 
		//Son clases que envuelven a los primitivos para que estos puedan utilizar alguno m�todos
		Byte numero1 = 127;
		
		numero1.longValue();
		
		//Tipos de datos:
		//Short
		//Integer
		//Long
		//Float
		//Double
		//Boolean
		//Character
		
		//SALIDA A LOS DATOS EN CONSOLA
		
		//Ocuparemos la funcion:
		System.out.println("Hola mundo");
		
		//Darle salida a los valores almacenados en alguna variable
		//syso o sout + Ctrl + espacio --- para REPETIR LO ESCRITO ANTERIORMENTE
		System.out.println(nombre); 
		
		//Podemos mandar igual suma de algunos valores directamente en consola o una suma de algunas variables
		System.out.println(20+35);
		
		int a = 15;
		int b = 60;
		
		System.out.println(a+b);
		
		//CONCATENACI�N
		//Se unen palabras y operaciones, pero estas �ltimas hay que separarlas
		System.out.println("El resultado de a + b es: " + a+b);
		
		//Si quiero que se reconozca como operaci�n, se debe englobar enytre par�ntesis (a+b)
		System.out.println("El resultado de a + b es: " + (a+b));
		
		
		
		
		
	} //Cierre del main

	
} //Cierre de la clase