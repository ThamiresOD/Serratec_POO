package br.org.serratec.teste;

import br.org.serratec.model.Medico;

public class TesteMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico(213, "Bere", 9000.00, 300.00);
		Medico medico2 = new Medico(653, "Rosa", 8000.00, 350.00);
		
		medico1.pagamentoDinheiro();
		medico2.pagamentoPlanoDeSaude();
		
		System.out.println("Total de médicos: " + Medico.getContador());
		
	}
}
