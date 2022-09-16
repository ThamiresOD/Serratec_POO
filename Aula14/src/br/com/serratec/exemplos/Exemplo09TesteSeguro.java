package br.com.serratec.exemplos;

import java.util.Optional;

import br.com.serratec.model.Carro;
import br.com.serratec.model.Seguro;

public class Exemplo09TesteSeguro {
	
	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total", 3000.);
		Carro c1 = new Carro("VW", "Gol", Optional.of(seguro));
		Carro c2 = new Carro("Fiat", "Palio", Optional.ofNullable(null));
		
		System.out.println(c1);
		
		if(c2.getSeguro().isPresent()) {
			System.out.println(c2);
		}
	}
}
