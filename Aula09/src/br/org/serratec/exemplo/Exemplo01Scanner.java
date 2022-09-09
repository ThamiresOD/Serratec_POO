package br.org.serratec.exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01Scanner {
	public static void main(String[] args) {
		try {
			System.out.println(" Você digitou: " + lerDados());
		} catch (InputMismatchException e) {
			System.out.println(" Exceção ");
		}
	}
	public static Integer lerDados() {
		Integer numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Informe um numero: ");
		numero = sc.nextInt();	
		sc.close();
		return numero;	
	}
}
