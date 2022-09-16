package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

		public static void main(String[] args) {
			Pessoa p1 = new Pessoa("A1", "A11", 15);
			Pessoa p2 = new Pessoa("B2", "B22", 47);
			Pessoa p3 = new Pessoa("C3", "C33", 25);
			
			List<Pessoa> pessoas = new ArrayList<>();
			pessoas.add(p1);
			pessoas.add(p2);
			pessoas.add(p3);
			
			Collections.sort(pessoas);
			System.out.println(pessoas);
			
			
		}
}
