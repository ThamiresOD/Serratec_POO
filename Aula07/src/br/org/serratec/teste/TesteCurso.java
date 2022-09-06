package br.org.serratec.teste;

import br.org.serratec.enums.PeriodoCurso;
import br.org.serratec.model.Curso;

public class TesteCurso {
public static void main(String[] args) {
	Curso curso = new Curso("JAVA", PeriodoCurso.INTEGRAL);
	
	System.out.println(" Nome do curso: " + curso.getNome());
	System.out.println("\n Dia do curso: " + PeriodoCurso.INTEGRAL.getDiasSemana());
	
}
}
