package br.org.serratec.model;

public class Proprietario {
	public String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	String getNome() {
		return nome;
	}

}
