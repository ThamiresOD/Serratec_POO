package br.org.serratec.Teste;

import br.org.serratec.model.Atleta;
import br.org.serratec.model.Time;

public class TesteAtleta {
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Bernard", "DH");
		Atleta atleta2 = new Atleta("Jassica", "FreeRide");
		Atleta atleta3 = new Atleta("Marc", "Enduro");
		Time time1 = new Time("RedBull", "Kerr", new Atleta[3]);

		time1.addAtletas(atleta1);
		time1.addAtletas(atleta2);
		time1.addAtletas(atleta3);

		System.out.println(time1.getNomeTime());
		time1.listarAtleta();

	}
}
