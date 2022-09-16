package br.org.serratec.model;

public class Cliente {
	private Integer codigo;
	private String nome, telefone, email;

	public Cliente(Integer codigo, String nome, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente id: " + codigo + "\n nome: " + nome + "\n telefone: " + telefone + "\n email: " + email;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

}
