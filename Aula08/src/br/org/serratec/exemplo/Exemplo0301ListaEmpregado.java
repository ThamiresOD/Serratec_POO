package br.org.serratec.exemplo;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Empregado;

public class Exemplo0301ListaEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>(); // <Tipo do que eu quero>
		
		empregados.add(new Empregado("Cold", "54654635"));
		empregados.add(new Empregado("Prof", "4125435"));
		empregados.add(new Empregado("Dona Morte", "25412452"));
		empregados.add(new Empregado("Vini", "2142554"));
		empregados.add(new Empregado("Bolts", "354674674"));
		
		for(Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}
}
