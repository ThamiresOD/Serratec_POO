package br.com.serratec.exemplos;

import br.com.serratec.interfaces.Calculo;

public class Exemplo02TesteCalculo {
	public static void main(String[] args) {

		Calculo c = new Calculo() {
		
			@Override
			public int operacao(int a, int b) {
				return a + b;
			}
		};
		System.out.println(" O resultado é: " + c.operacao(10, 15));
		
		// Lambda
		Calculo c2 = (a, b)-> a + b; 
		System.out.println(" O calculo 2 é: " + c2.operacao(15, 45));
	};
}
