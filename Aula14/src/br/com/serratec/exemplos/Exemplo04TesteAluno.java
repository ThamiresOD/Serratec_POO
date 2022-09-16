package br.com.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.serratec.model.Aluno;

public class Exemplo04TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno(" Vi ", " vi@gmail.com ", 28), new Aluno(" Thata ", " 2TAE1H@gmail.com ", 24));
		
	/*	for (Aluno aluno : alunos) {
			System.out.println(aluno);
		
		ExibirDadosAluno eda = new ExibirDadosAluno();		
		
		
	// Lambda expression
		Consumer<Aluno> eda = t -> {
			System.out.println("-----Dados do Aluno------");
			System.out.println(t.getNome());
			System.out.println(t.getEmail());
			System.out.println(t.getIdade());
		};
		
		Consumer<Aluno> eda = new Consumer<Aluno>() {

			@Override
			public void accept(Aluno t) {
				System.out.println("-----Dados do Aluno------");
				System.out.println(t.getNome());
				System.out.println(t.getEmail());
				System.out.println(t.getIdade());
			}
		alunos.forEach(eda);
		};
	*/
		alunos.forEach(t -> { System.out.println("\n ---------- Aluno ---------- \n " 
		+ "- Nome: " + t.getNome() + "\n - Email:" + t.getEmail() + "\n - Idade: " + t.getIdade());;
		});
	}		
}
