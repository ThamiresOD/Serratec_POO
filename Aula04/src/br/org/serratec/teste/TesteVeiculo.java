package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao c1 = new Caminhao ("123", "abc-456", "Azul", 90000.00, 5000 );
		c1.calcularIPVA();
		System.out.println("Valor do Ipva:" + c1.getIpva());
		System.out.println(c1);
		
		
	}

}