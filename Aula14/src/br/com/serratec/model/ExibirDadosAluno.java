package br.com.serratec.model;

import java.util.function.Consumer;

public class ExibirDadosAluno implements Consumer<Aluno>{

	@Override
	public void accept(Aluno t) {
		System.out.println("\n --------- Dados do aluno: ------------------\n\n" + " - Nome: " + t.getNome() + " - Email: " + t.getEmail() + " - Idade: " + t.getIdade());
	}
}
