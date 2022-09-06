package Aula02Exercicios;

import java.util.Scanner;

public class Aula02Exercicio05 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um número: ");
		n = sc.nextInt();

		// Saida de dados
		System.out.printf("O número antecessor de é " + (n - 1) + " e o número sucessor é " + (n + 1));

		// Fechamento do Scanner
		sc.close();
	}
}
