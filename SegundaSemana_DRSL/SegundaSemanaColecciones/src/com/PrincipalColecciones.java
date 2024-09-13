package com;

import java.util.*;

public class PrincipalColecciones {

	public static void main(String[] args) 
	{
			// LISTAS
			List<String> lista = new ArrayList<String>();
			lista.add("Hola");
			lista.add("como");
			lista.add("estas");
			lista.add(" ? ");
			lista.add("estas");
			
			System.out.println(lista);
			
			System.out.println(lista.get(0));
			
			System.out.println(lista.contains("estas"));
			
			System.out.println(lista.indexOf("estas"));
			
			System.out.println(lista.lastIndexOf("estas"));
			
			lista.remove(0);
			
			System.out.println(lista.get(0));
			
			lista.add(1, "ORELE");
			
			System.out.println(lista);
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				
			}
			//Lista de lo que sea
			List<Object> objetos = new ArrayList<Object>();
			
			objetos.add(100);
			objetos.add("ASD");
			objetos.add(100.3f);
			objetos.add('0');
			System.out.println(objetos);
			
			
			//MAPAS
			//Deben usar variables Wrapper
			Map<Integer , String> mapa = new HashMap<Integer , String>();
			mapa.put(0, "Valor1");
			mapa.put(3, "Valor4");
			System.out.println(mapa);
			System.out.println(mapa.containsValue("Valor2"));
			System.out.println(mapa.containsValue("Valor1"));
			
			System.out.println(mapa.containsKey(0));
			System.out.println(mapa.containsKey(1));
			System.out.println(mapa.keySet());
			System.out.println(mapa.values());
			
			for(Integer i : mapa.keySet())
			{
				System.out.println("For each KeySet = "+i);
			}
			for(String j : mapa.values())
			{
				System.out.println("For each Values = "+ j);
			}
			System.out.println(mapa.remove(3));
			
			System.out.println(mapa);
			
			System.out.println("========SET=========");
			Set<Integer> setList = new HashSet<Integer>();
			//No ordena los valores
			//Sin valores repetidos
			//Todas las collecciones se deben crear con Wrapper
			setList.add(23);
			setList.add(87);
			setList.add(2);
			setList.add(1);
			setList.add(45);
			System.out.println(setList);
			System.out.println("========SET TREE=========");
			Set<Integer> setListTree = new TreeSet<Integer>();
			
			setListTree.add(23);
			setListTree.add(3);
			setListTree.add(10);
			setListTree.add(0);
			
			System.out.println(setListTree);
			Iterator<Integer> valores = setListTree.iterator();
			
			System.out.println("========SET TREE ITERADO=========");
			while(valores.hasNext())
			{
				System.out.println(valores.next());
			}
	}

}
