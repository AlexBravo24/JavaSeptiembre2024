package com;

public class Principal {

	public static void main(String[] args) {
		
		Procesador mediaTek = new Procesador("MediaTek Helio G85", "64 bits", 8);
		
		Bateria carga = new Bateria("5,000 mAh","Bater�a de iones de litio (Li-Ion) no extra�ble",36);
		
		Bocina bocina = new Bocina ("Doble altavoz est�reo","Dolby Atmos","Jack de 3.5 mm para auriculares");
		
		Celular motorola = new Celular("Motorola","Motog13", "Azul", mediaTek, carga,bocina);

		System.out.println(motorola);

	}

}
