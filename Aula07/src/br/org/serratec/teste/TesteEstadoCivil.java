package br.org.serratec.teste;

import java.util.Iterator;

import br.org.serratec.enums.EstadoCivil;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.Setor;

public class TesteEstadoCivil {
	public static void main(String[] args) {
		Setor setor1 = new Setor(456, "RH");
		Setor setor2 = new Setor(454, "DP");
		
		Pessoa pessoa1 = new Pessoa("P", "6565374", EstadoCivil.CASADO, setor2);
		Pessoa pessoa2 = new Pessoa("L", "65544420", EstadoCivil.CASADO, setor1);
		
		System.out.println("------- Dados pessoais ------- \n" + pessoa1);
		
		for (EstadoCivil estado : EstadoCivil.values()) {
			System.out.println(estado);
		}
			
		}
	

}
