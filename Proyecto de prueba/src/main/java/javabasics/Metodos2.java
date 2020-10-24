package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String heredar = "Mesaje de texto";

	protected static List<String> listaDeNombres()
	{
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Pancha");
		listaNombres.add("Lola");
		listaNombres.add("Lola");
		listaNombres.add("Venancio");
		listaNombres.add("OK");	
		
		return listaNombres;
	}
	
	protected static List<Integer> listaNumeros(){
		
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(5);
		listaNumeros.add(10);
		listaNumeros.add(15);
		listaNumeros.add(10);
		listaNumeros.add(25);
		listaNumeros.add(10);
		
		return listaNumeros;
		
	}
}
