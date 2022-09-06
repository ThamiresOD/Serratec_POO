package br.org.serratec.teste;

import br.org.serratec.model.ContaCorrente;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(" Thata", 2590000.);
		
		cc.deposito(7000.);
		cc.saque(89000.);
		
		System.out.println(" Seu saldo é: " + cc.toString());
	
	}
}
