package teste;

import java.util.Scanner;

public class TesteEntradaDados1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println(" Entre com o 1° valor: ");
		a = sc.nextInt();

		System.out.println(" Entre com o 2° valor: ");
		b = sc.nextInt();

		System.out.println("\n O resultado da soma é: " + (a + b));
		
		sc.close();
	}
}
