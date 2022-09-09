package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Medico;

public class TesteMedicoLista {
	public static void main(String[] args) {
		List<Medico> medicos = new ArrayList<>();
		
		medicos.add(new Medico("135", "A", 200.));
		medicos.add(new Medico("146", "B", 250.));
		medicos.add(new Medico("159", "C", 150.));
		
		Double maior = 0.;
		String nome = "";
		
		for(Medico medico : medicos) {
			if (medico.getValorConsulta() > maior) {
				maior = medico.getValorConsulta();
				nome = medico.getNome();
			}
		}
		System.out.println("O medico " + nome + " cobra a consulta mais cara, R$: " + maior);
	}
}

