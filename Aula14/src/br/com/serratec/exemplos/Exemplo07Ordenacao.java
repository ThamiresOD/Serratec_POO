package br.com.serratec.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.serratec.model.Aluno;

public class Exemplo07Ordenacao {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Romin ", "dh@gmail.com ", 25);
		Aluno a2 = new Aluno("Alice ", "al@hotmail.com ", 35);
		Aluno a3 = new Aluno("Vi ", "pt@gmail.com ", 26);
		Aluno a4 = new Aluno("Ashe ", "ashe@hotmail.com ", 28);
		Aluno a5 = new Aluno("Thata ", "2TAE1H@gmail.com ", 24);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		System.out.println("\n\n----Ordenando por idade antes do Java 8--------");
		alunos.stream().sorted().forEach(n -> System.out.println(n));
	
		
		System.out.println("\n\n----Ordenando pela nome após do Java 8");
		Comparator<Aluno> ordenarNome = (o1,o2) -> o1.getNome().compareTo(o2.getNome());
		Collections.sort(alunos,ordenarNome);	
		alunos.forEach(a-> System.out.println(a));
		
		System.out.println("\n\n----Ordenando por email Java 8--------");
		alunos.sort((o1,o2) -> o1.getEmail().compareTo(o2.getEmail()));
		alunos.forEach(a-> System.out.println(a));
		
	}
}
