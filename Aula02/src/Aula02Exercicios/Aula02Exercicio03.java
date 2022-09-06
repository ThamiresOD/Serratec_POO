package Aula02Exercicios;

public class Aula02Exercicio03 {

	public static void main(String[] args) {
		int i = 1, j, qt = 10, f = i;
		
		for (i = 1; i <= qt; i++) {
		/*	if (i <= 1) {
				System.out.printf("\n O fatorial de " + i + " é: 1");
			} else {*/
				for (j = i; j > 1; j--) {
					f = f * j ;
				}
				System.out.printf("\n O fatorial de " + i + " é: " + f);
			}
		}
	}
//}

