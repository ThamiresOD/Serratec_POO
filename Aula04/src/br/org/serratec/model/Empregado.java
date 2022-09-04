package br.org.serratec.model;

public class Empregado {
	private String nome;
	private String email;
	private Double salario;

	public Empregado(String nome, String email, Double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado \nNome: " + nome + "\nEmail=" + email + "\nSalario=" + salario;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalario() {
		return salario;
	}

}
