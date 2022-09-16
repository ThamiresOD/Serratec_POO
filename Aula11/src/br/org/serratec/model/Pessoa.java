package br.org.serratec.model;

public class Pessoa implements Comparable<Pessoa>{

	private String nome, email;
	private Integer idade;

	public Pessoa(String nome, String email, Integer idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return " \n\n-> Pessoa: " + nome + "\n email: " + email + "\n idade: " + idade;
	}

	String getNome() {
		return nome;
	}

	String getEmail() {
		return email;
	}

	Integer getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		return idade-o.getIdade();
	}

}
