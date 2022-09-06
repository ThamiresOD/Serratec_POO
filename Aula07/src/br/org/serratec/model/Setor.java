package br.org.serratec.model;

public class Setor {
	private Integer numero;
	private String descricao;

	public Setor(Integer numero, String descricao) {
		super();
		this.numero = numero;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "numero: " + numero + ", descricao: " + descricao;
	}

	Integer getNumero() {
		return numero;
	}

	String getDescricao() {
		return descricao;
	}

}
