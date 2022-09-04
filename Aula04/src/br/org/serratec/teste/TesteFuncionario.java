package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Romulo", 8000., "Economia");
		Assistente assistente = new Assistente("312", "Thamires", 7800., "Economia");
		
		System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.getSalario());
		System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.getSalario());
	}

}
