package br.com.serratec.exemplos;


import java.util.Arrays;
import java.util.List;

import br.com.serratec.model.Aluno;

public class Exemplo0502Stream {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Romin ", "dh@gmail.com ", 25);
		Aluno a2 = new Aluno("Alice ", "al@hotmail.com ", 35);
		Aluno a3 = new Aluno("Vi ", "pt@gmail.com ", 26);
		Aluno a4 = new Aluno("Ashe ", "ashe@hotmail.com ", 28);
		Aluno a5 = new Aluno("Thata ", "2TAE1H@gmail.com ", 24);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		// Filter - filtro de dados que retorna um boolean
		alunos.stream().filter(a -> a.getIdade() > 30).forEach(t -> System.out.println(t));
		alunos.stream().filter(a -> a.getNome().startsWith("A")).forEach(t -> System.out.println(t));
		
	}
}
