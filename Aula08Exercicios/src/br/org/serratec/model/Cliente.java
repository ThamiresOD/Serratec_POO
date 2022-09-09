package br.org.serratec.model;

public class Cliente {
	private String nome, telefone;
	private Integer id = 0, idade;

	public Cliente(String nome, String telefone, Integer id, Integer idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.id = id;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\n Cliente: " + nome + "\n telefone: " + telefone + "\n id: " + id + "\n idade: " + idade;
	}

	String getNome() {
		return nome;
	}

	String getTelefone() {
		return telefone;
	}

	Integer getId() {
		return id;
	}

	Integer getIdade() {
		return idade;
	}

}
