package br.org.serratec.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo0300Lista {
	public static void main(String[] args) {
		String times[] = {"MIBR", "Imperial"};
		List listas = new ArrayList<>();
		
		listas.add("N1");
		listas.add("N2");
		listas.add("N4");
		listas.add(true);
		listas.add(50.);
		
		System.out.println("Tamanho da lista: " + listas.size());
		listas.remove(1); // Remove pelo indice
		listas.set(1, "N3"); // Altera a info do indice
		System.out.println(listas.get(2)); // Retorna a info do indice
		System.out.println(listas);
	}
}
