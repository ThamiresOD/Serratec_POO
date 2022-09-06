package Aula02Exercicios;

import java.util.Scanner;

public class Aula02Exercicio01Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i = 0;
		
		//Entrada de dados
		System.out.println("Digite o número que quer saber a tabuada: ");
		a = sc.nextInt();
		
		//Saida de dados
		System.out.println("+--Resultado--+\n");

		for (i = 1; i < 10; i++) {
			if (i * a == a) {
				System.out.println("|  " + i + " * " + a + " =  " + (i * a) + " |");
			}else {
				System.out.printf("|  " + i + " * " + a + " = " + (i * a) + " |\n");
			}
		}
		System.out.println("+-------------+");
		
		//Fechamento Scanner
		sc.close();
	}
}
