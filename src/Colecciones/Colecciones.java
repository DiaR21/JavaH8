package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main( String [] args) {
		
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos
		// La diferencia de las colecciones y los objetos
		// es que las colecciones son dinamicas, pueden cambiar
		// el numero de objeto agregados
		
		// Set tiene 3 tipos de implementaciones, 
		// no puede cotener elementos repetidos
		
		// 1.- HashSet
		// los elementos no mantiene un orden
		
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		
		//foreach, puede recorrer una coleccion y en cada
		//recorrido recupera eñvalor y lo podemos almacenar
		//en una variable
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		
		/*for (String fruta : frutas) {
			System.out.println(fruta);		
		}*/
		
		// 2.- TreeSet
		// Esta implementacion ordena los elementos en funcion de sus valores
		//es la implementacion mas lenta
		
		
		/*Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
		System.out.println(fruta);		
	    }*/
		
		
		// 3.- LinkeHashSet
		//Ordena los elemnetos en oren de insercion
		//es mas costoso que HashSet
		
		
		/*Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
		System.out.println(fruta);		
	    }*/
		
		//List
		//se permiten elementox duplicados
		//acceder a elementos especificos
		//buscar elementos
		
		//ArrayList
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Charmander");
		pokemones.add("Gengar");
		pokemones.add("Psyduck");
		pokemones.add("Eve");
		pokemones.add("Dragonaite");
		pokemones.add("Meuow");
		pokemones.add("Charizard");
		pokemones.add("Pikachu");
		pokemones.add("Gengar");
		
		// add si agregamos un indice y un elemento, posiciona
		// el elemento en el indice y realiza un desplazamiento
		//es decir no borra el elemnto en la posicion sino 
		// que lo desplaza
		
		pokemones.add(2,"Flygon");
		
		//remove remueve el elemento de la posicion espefifica
		pokemones.remove(6);
		
		// set reemplaza el elemento en la poscion especifica
		pokemones.set (0,"Lugia");
		
		for (String pokemon : pokemones) {
			System.out.println(pokemon);		
		    }
		
		System.out.println("*******");
		System.out.print(pokemones.get(5) + "\n");
		
		// indexof, nos va devolver la posicion del elemento
		//y si el elemento no se encuentra nos devuelve -1
		
		System.out.println("*******");
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.lastIndexOf("Gengar"));
		System.out.println(pokemones.indexOf("Togepi"));
		
		
		//LinkedList
		List<String>digimones=new LinkedList<String>();
		digimones.add("Agummon");
		digimones.add("Patamon");
		digimones.add("Angelmon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		//Map
		// Asocia claves a valores
		//No puede contener claves duplicadas
		//Sólo puede contener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento pero no ganarntiza un orden
		//a la hora de hacer iteraciones
		
		Map<Integer,String> usuarios=new HashMap<Integer,String>();
		usuarios.put(1,"Carlos");
		usuarios.put(2,"Raul");
		usuarios.put(3,"Ro");
		System.out.print(usuarios.get(2));
		System.out.print(usuarios.keySet());
		System.out.print(usuarios.values());
		
		// TreeMap
		Map<String, String> tamales=new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta", "Mole Verde");
		tamales.put("Dulce", "Gansito");
		tamales.put("Salado", "Cochinita");	
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		tamales.entrySet().forEach(elemento->{
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		//LinkedHasMap
		Map<Integer, String> carros=new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(567, "Poiter");
		carros.put(8, "Mustang");
		System.out.print(carros.keySet());
		System.out.print(carros.values());
		}

		
}