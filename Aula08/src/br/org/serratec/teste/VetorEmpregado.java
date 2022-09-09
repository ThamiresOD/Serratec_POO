package br.org.serratec.teste;

import br.org.serratec.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		Empregado empregados[] = new Empregado[3];
		
		empregados[0] = new Empregado("VI", "2341534");
		empregados[1] = new Empregado("Cait", "254387");
		empregados[2] = new Empregado("Ashe", "2341956");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}
}
