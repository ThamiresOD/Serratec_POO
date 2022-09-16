package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {
	
	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>(" Hello World! ");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>("Vi", "vi@gmail.com", 2200.);
		System.out.println(mg3);
		
		// Qualquer objeto que tenha como super o Funcionario
		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(new Diretor(" Cait ", "c@gmail.com", 500., "CEO"));
		System.out.println(mg4);
	}
}
