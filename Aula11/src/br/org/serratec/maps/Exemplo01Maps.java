package br.org.serratec.maps;

import java.util.Map;
import java.util.TreeMap;

public class Exemplo01Maps {

	public static void main(String[] args) {
		
	//	LinkedHashMap<String, String> estados = new LinkedHashMap<>(); // Tree ordena
		TreeMap<String, String> estados = new TreeMap<>(); // Tree ordena
	//	Map<String, String> estados = new Map<>();

		estados.put(" RJ", " Rio");
		estados.put(" RJ", " Rio de janeiro");
		estados.put(" SP", " São Paulo");
		estados.put(" AC", " Acre");
		estados.put(" MG", " Minas Gerais");
		estados.put(" SE", " Sergipe");
	
		System.out.println(" \n ----------------- Retorna as chaves/siglas do mapa ----------------- \n");
		for (String string : estados.keySet()) {
			System.out.println(string);
		}
		
		System.out.println(" \n ----------------- Retorna os valores do mapa  ----------------- \n");
		for (String string : estados.values()) {
			System.out.println(string);
		}
		
		System.out.println(" \n ----------------- Retorna os valores do mapa  ----------------- \n");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa);
		//	System.out.println(mapa.getKey() + " - " + mapa.getValue());
		}
		System.out.println(" \n ----------------- Retorna os valores do mapa  ----------------- \n");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa);
		}
	}
}
