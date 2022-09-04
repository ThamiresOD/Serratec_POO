package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
/*		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Thamires");
		pessoa1.setPeso(55.5);
		pessoa1.setAltura(1.62);
		
		System.out.println("De acordo com o IMC você está com " + pessoa1.resultadoIMC());
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "Romulo",80.5,1.65);
		System.out.println("Sua situação é: " + pessoa2.resultadoIMC());
	*/	
		for (int i = 0; i <= 1; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o código:");
			Integer codigo = sc.nextInt();

			System.out.println("Digite o nome:");
			String nome = sc.next();
			
			System.out.println("Digite o peso:");
			Double peso = sc.nextDouble();

			System.out.println("Digite a altura:");
			Double altura = sc.nextDouble();

			Pessoa pessoa = new Pessoa(codigo, nome, peso, altura);
			System.out.println("O resultado é:" + pessoa.resultadoIMC());
		
			sc.close();
		}
		
	}
}
