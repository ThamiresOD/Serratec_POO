package br.org.serratec.teste;

import br.org.serratec.exception.ContaException;
import br.org.serratec.model.Poupanca;

public class TesteConta {
	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca(" Thata ", 2563000.);
		
		
		try {
			poupanca.deposito(1.);
			poupanca.saque(26000000.);
			
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
	}
}
