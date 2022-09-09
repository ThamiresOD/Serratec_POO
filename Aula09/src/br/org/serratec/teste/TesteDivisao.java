package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisao {
	public static void main(String[] args) {
		try {
			System.out.println(CalculoMedia.calcular(10, 0));
			
		} catch (ArithmeticException e) {
			System.out.println(" Erro! Divisão por zero! Verifique os dados inseridos.");
			e.printStackTrace(); // Retorna a mensagem de erro original
			
		}finally { // Sempre é executado independente se cair ou não no catch! 
			System.out.println(" Fechar o programa! ");
		}
	}
}

