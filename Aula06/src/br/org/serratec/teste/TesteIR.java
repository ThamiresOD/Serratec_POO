package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalTributos;

public class TesteIR {
	public static void main(String[] args) {
		Empresa e = new Empresa("Doojiih", 820000.);
		Pessoa p = new Pessoa("Romin", 82000.);
		TotalTributos t = new TotalTributos();
		
		System.out.println(e + " Tributos à pagar: ICMS " + e.calcularICMS() + " IR: " + e.calcularIR() + "\n");
		System.out.println(p + " IR: " + p.calcularIR());
		
		t.totalTributos(e);
		t.totalTributos(p);
		System.out.println(" Total de tributos arrecadados: " + (t.totalTributos(p) + t.totalTributos(e)));
	}
}
