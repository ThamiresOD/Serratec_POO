package br.org.serratec.exemplos;

import java.time.LocalDate;

public class Exemplo02 {

	public static void main(String[] args) {
		// ALT+SHIFT+R -> Alterar nome de variaveis/metodos
		// CTRL+SHIFT+F -> Identacao do programa
		// CTRL+SHIFT+O -> Importacao de pacotes
		int preco = 100;
		preco = 300;
		LocalDate data = LocalDate.now();
		List Alunos;

		System.out.println("Hoje é dia: " + data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}
}
