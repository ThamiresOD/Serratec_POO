package br.org.serratec.model;

import java.time.LocalDate;

public class Tucano extends Ave{
	private Double peso;
	
	public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	@Override
	public String voar() {
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	Double getPeso() {
		return peso;
	}

	void setPeso(Double peso) {
		this.peso = peso;
	}

	

}
