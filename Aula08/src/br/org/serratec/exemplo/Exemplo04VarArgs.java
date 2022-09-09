package br.org.serratec.exemplo;

public class Exemplo04VarArgs {

	public static void main(String[] args) {
		
		// VarArgs (...) = Varios argumentos
		// System.out.printf("Thata", 1.62, 250000000, true);
		
		System.out.println(somarNumeros(true, 10, 20, 30, 40, 100, 200));

	}
		public static int somarNumeros(boolean a, int...numeros) {
			int soma = 0;
			for(int valor : numeros) {
				soma += valor;
			}
			return soma;
		}
}

