package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;

public class TesteSorteio {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(" Vi", "Vi@gmail.com", 8500.);
		Funcionario f2 = new Funcionario(" Cait", "cait@gmail.com", 2590.);
		Funcionario f3 = new Funcionario(" Ashe", "ashe@gmail.com", 6560.);
		Funcionario f4 = new Funcionario(" Al", "al@gmail.com", 7400.);
		
		Sorteio<Funcionario> st = new Sorteio<>();
		st.adicionar(f1);
		st.adicionar(f2);
		st.adicionar(f3);
		st.adicionar(f4);
		
		System.out.println(" Quem ganhou o sorteio foi:\n\n" + st.sorteio());
		
	}
}
