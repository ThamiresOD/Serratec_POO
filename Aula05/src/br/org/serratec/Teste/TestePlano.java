package br.org.serratec.Teste;

import br.org.serratec.model.Anestesista;
import br.org.serratec.model.Clinica;
import br.org.serratec.model.Medico;

public class TestePlano {
	
	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", 1300., 50., "Checkup", "24134585416354");
		Medico medico = new Medico("Golden Cross", 1200., 90., 1234, "Antônio Carlos");
		Anestesista anestesista = new Anestesista("Amil", 800., 50., 135, "Cait", "Geral");
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		System.out.println(clinica + "Valor a receber do plano: " + clinica.getValorPago());
		System.out.println(medico + "Valor a receber do plano: " + medico.getValorPago());
		System.out.println(anestesista + "Valor a receber do plano: " + anestesista.getValorPago());
	}

}
