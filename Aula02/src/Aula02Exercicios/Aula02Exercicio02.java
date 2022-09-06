package Aula02Exercicios;

import java.util.Scanner;

public class Aula02Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  j = 5, n = j, i;
		double p = 0.0, a = 0.0, mediaPeso = 0.0, mediaAltura = 0.0;
		String pesoMaior = "", alturaMaior = "";
		
		//Vetores
		String nome[] = new String[n];
		double  peso[] = new double[n];
		double altura[] = new double[n];
		
		//Entrada de dados
		n = 0;
		for (i = 1; i <= j; i++) {
			
			System.out.println(" Digite o nome da " + i + "° pessoa: ");
			nome[n] = sc.next();
			
			System.out.println(" Digite o peso da(o) " + nome[n]);
			peso[n] = sc.nextDouble();
			mediaPeso += peso[n];
				if (peso[n] > p) {
					pesoMaior = nome[n];
				}
			p = peso[n];

			System.out.println(" Digite a altura da(o) " + nome[n]);
			altura[n] = sc.nextDouble();
			mediaAltura += altura[n];
				if (altura[n] > a) {
					alturaMaior = nome[n];
				}
			a = altura[n];
			n++;
		}
		
		//Processamento
		mediaPeso = (mediaPeso/j);
		mediaAltura = mediaAltura/j;
		
		
		//Saida de dados
		System.out.printf("\n A pessoa mais pesada é: " + pesoMaior 
					+ "\n A pessoa mais alta é: " + alturaMaior 
					+ "\n A média de peso das pessoas é: " + mediaPeso 
					+ "\n A média de altura das pessoas é: " + mediaAltura);
		
		
		
		//Fechamento Scanner
		sc.close();
	}
}
