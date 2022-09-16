package br.org.serratec.model;

public class Diretor extends Funcionario {
	
	private String categoria;

	public Diretor(String nome, String email, Double valor, String categoria) {
		super(nome, email, valor);
		this.categoria = categoria;
	}

	String getCategoria() {
		return categoria;
	}
	
	

}
