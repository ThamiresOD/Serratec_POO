package teste;

import java.util.Scanner;

public class TesteEntradaDados2 {

	public static void main(String[] args) {
		String nome, sobrenome; //%s
		int idade; //%d
		double altura; //%f
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite o nome: ");
		nome = sc.next();
		
		System.out.println(" Digite o nome: ");
		sobrenome = sc.next();
		
		System.out.println(" Digite a idade: ");
		idade = sc.nextInt();
		
		System.out.println(" Digite a altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("%s %s tem %d anos e %.2f de altura.", nome, sobrenome, idade, altura);
		
		sc.close();
	}

}
