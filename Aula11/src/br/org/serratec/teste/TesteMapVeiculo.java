package br.org.serratec.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteMapVeiculo {
	
	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<>();
		
		carros.put(" Honda ", "Civic");
		carros.put(" Fiat ", "Uno");
		carros.put(" Land Rover ", "FreeLander");
		
		System.out.println("---------- Carros ----------");
		for (Map.Entry<String, String> carro : carros.entrySet()) {
			System.out.println(carro);
		}
	}
}
