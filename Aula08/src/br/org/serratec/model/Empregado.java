package br.org.serratec.model;

public class Empregado {
	private String nome, telefone;

	public Empregado(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Empregado nome: " + nome + ", telefone: " + telefone;
	}

	String getNome() {
		return nome;
	}

	String getTelefone() {
		return telefone;
	}
	
	

}
