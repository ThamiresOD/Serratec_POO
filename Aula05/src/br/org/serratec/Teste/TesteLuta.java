package br.org.serratec.Teste;

import br.org.serratec.model.Categoria;
import br.org.serratec.model.Luta;
import br.org.serratec.model.Lutador;

public class TesteLuta {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("Peso Pesado");
		Categoria categoria2 = new Categoria("Peso Pena");
		
		Lutador lutador1 = new Lutador("Ruby", 55., 32, categoria2);
		Lutador lutador2 = new Lutador("Ronda", 55.9, 36, categoria2);
		
		Luta luta = new Luta(lutador1, lutador2, false);
		
		System.out.println((luta.confirmacaoLuta()) ? "Luta Confirmada" : "Luta Cancelada");
	}
}
