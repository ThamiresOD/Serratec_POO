package br.org.serratec.model;

public class Funcionario {

	private String nome, email;
	private Double valor;

	public Funcionario(String nome, String email, Double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return " -> Funcionario: " + nome + "\n email: " + email + "\n valor: " + valor;
	}

	String getNome() {
		return nome;
	}

	String getEmail() {
		return email;
	}

	Double getValor() {
		return valor;
	}

}
