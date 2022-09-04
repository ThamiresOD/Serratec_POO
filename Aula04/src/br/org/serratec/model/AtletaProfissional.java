package br.org.serratec.model;

public class AtletaProfissional extends Maratona {
	private Double peso;

	public AtletaProfissional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPeso: " + peso;
	}

	public Double getPeso() {
		return peso;
	}
	
}