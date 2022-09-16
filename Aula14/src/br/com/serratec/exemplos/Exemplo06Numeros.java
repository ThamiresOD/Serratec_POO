package br.com.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo06Numeros {

		public static void main(String[] args) {

			// Adiciona 200 a todos os valores
			List<Integer> numeros = Arrays.asList(10, 100, 200, 300, 400, 900, 1200, 40);
			numeros.stream().map(t -> t + 200).forEach(t -> System.out.println(t));
			System.out.println(" ----------------------------------------------------- ");

			// Alterar de String para Double
			List<String> n2 = Arrays.asList("30", "500", "180", "200", "80");
			n2.stream().map(n -> new Double(n)).forEach(n -> System.out.println(n));
			System.out.println(" ----------------------------------------------------- ");
			
			// Count - conta quantos foram alterados
			System.out.println(n2.stream().map(n -> new Double(n)).count());
			System.out.println(" ----------------------------------------------------- ");

			// Skip - pula
			n2.stream().skip(2).forEach(n -> System.out.println(n));
			System.out.println(" ----------------------------------------------------- ");
			
			// Limit - limita a exibicao
			n2.stream().limit(3).forEach(n -> System.out.println(n));
			System.out.println(" ----------------------------------------------------- ");
			
			// Distinct - ignora repetidos
			n2.stream().distinct().forEach(n -> System.out.println(n));
			System.out.println(" ----------------------------------------------------- ");
			
			// Sorted - sortidos
			n2.stream().distinct().sorted().forEach(n -> System.out.println(n));
			System.out.println(" ----------------------------------------------------- ");
		}
}
