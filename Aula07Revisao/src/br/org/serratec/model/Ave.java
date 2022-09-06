package br.org.serratec.model;

import java.time.LocalDate;

public abstract class Ave extends Animal{
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	String getCor() {
		return cor;
	}

	void setCor(String cor) {
		this.cor = cor;
	}
	public abstract String voar();
	
	
}
