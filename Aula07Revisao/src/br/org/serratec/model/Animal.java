package br.org.serratec.model;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;

	public Animal(String nome, LocalDate dataVacinacao) {
		super();
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	LocalDate getDataVacinacao() {
		return dataVacinacao;
	}

	void setDataVacinacao(LocalDate dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public abstract String emitirSom();

}
