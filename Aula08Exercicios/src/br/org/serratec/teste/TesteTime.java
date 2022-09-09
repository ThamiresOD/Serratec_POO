package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Time;

public class TesteTime {
	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<>();

		atletas.add(new Atleta("Fofao","lider de torcida ", 85));
		atletas.add(new Atleta("Miranha"," jovem promissor ", 14));
		atletas.add(new Atleta("Bátima","investidor ", 52));
		atletas.add(new Atleta("Braya","motorista ambulância ", 40));
      
		Time time1 = new Time("Os carreteiros ", "zé", "jo", atletas);
		
		System.out.println(time1);
	}
}
