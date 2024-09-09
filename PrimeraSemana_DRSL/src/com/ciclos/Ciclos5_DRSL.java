package com.ciclos;


public class Ciclos5_DRSL {

	public static void main(String[] args) {
//		5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
//		de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		System.out.println("===== EJERCICIO #5 =====");		
		

		int seconds =0;
		int minutes=00;
		int hours=0;
		String timeString="";
		boolean clockOn = true;
		
		while(clockOn)
		{	
			seconds++;
				try
				{			
					Thread.sleep(10);
				}
				catch(Exception e)
				{
					System.out.println("SE ROMPIO EL RELOJ!");
				}
					if(seconds<10)
					{
						timeString = timeString +"0"+seconds+" : ";					
					}
					else if(seconds >=10)
					{
						timeString = timeString + seconds+" : ";
					}
						if(seconds > 59)
						{
							seconds = 0;
							minutes++;	
							if(minutes > 59)
							{
								hours++;
								minutes =0;	
								if(hours > 23)
								{
									hours = 0;
								}
							}
						}
						if(minutes <10)
						{
							timeString = timeString + "0"+minutes+" : ";							
						}
						else if(minutes >= 10)
						{
							timeString = timeString+minutes+ " : ";
						}
						
						if(hours <10)
						{
							timeString = timeString + "0"+ hours;							
						}
						else if(hours >= 10)
						{
							timeString = timeString+hours;
						}
					System.out.println(timeString);
					
					
					timeString = "";
					
		}
	}

}
