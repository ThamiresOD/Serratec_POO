package br.org.serratec.teste;

import br.org.serratec.model.AtletaProfissional;

public class TesteMaratona {

	public static void main(String[] args) {
		AtletaProfissional a1 = new AtletaProfissional("Thata", "Feminino", 24, 1.65, 00.0);

		// Validação de atestado (somente amadores)
		if (a1.podeCompetir()) {
			System.out.println(a1.toString() + "\nPode competir!");
		} else {
			System.out.println(a1.toString() + "\nNão pode competir!");
		}
	}

}