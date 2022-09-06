package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimentos;

	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return " Pessoa - Nome: " + nome + "\n Rendimentos: " + rendimentos;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	Double getRendimentos() {
		return rendimentos;
	}

	void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public Double calcularIR() {
		return rendimentos * ipf;
	}

	@Override
	public Double calcularICMS() {
		return 0.0;
	}

}
