package br.org.serratec.model;

import br.org.serratec.enums.PeriodoCurso;

public class Curso {
	private String nome;
	private PeriodoCurso periodo;

	public Curso(String nome, PeriodoCurso periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + "período: ";
	}

	public String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	PeriodoCurso getPeriodo() {
		return periodo;
	}

	void setPeriodo(PeriodoCurso periodo) {
		this.periodo = periodo;
	}

}
