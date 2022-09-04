package br.org.serratec.model;

public class Programador extends Empregado {
	private String linguagem;

	public Programador(String nome, String email, Double salario, String linguagem) {
		super(nome, email, salario);
		this.linguagem = linguagem;

	}

	public String getLinguagem() {
		return linguagem;
	}

}
