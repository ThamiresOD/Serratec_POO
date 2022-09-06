package br.org.serratec.model;

import br.org.serratec.enums.EstadoCivil;

public class Pessoa {
	private String nome, telefone;
	private EstadoCivil estadoCivil;
	private Setor setor;
	
	public Pessoa(String nome, String telefone, EstadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.setor = setor;
	
	}
	@Override
	public String toString() {
		return " Nome: " + nome + ", telefone: " + telefone + ", estado civil: " + estadoCivil + ", setor: " + setor;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	Setor getSetor() {
		return setor;
	}
	
	
}
