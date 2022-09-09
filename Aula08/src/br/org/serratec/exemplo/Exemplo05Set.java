package br.org.serratec.exemplo;

import java.util.HashSet;
import java.util.Set;

public class Exemplo05Set {

	public static void main(String[] args) {
		
		// Nao aceita elementos duplicados
		Set<String> cores = new HashSet<>();

		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		cores.add("Azul");
		
		System.out.println(cores);
	}
		// Ordena por ordem alfabetica (TreeSet)
		// Set<String> cores = new TreeSet<>();

	/*	cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Preto");
		cores.add("Verde");
		cores.add("Azul");
		cores.add("Azul");
	
		System.out.println(cores); */
}
