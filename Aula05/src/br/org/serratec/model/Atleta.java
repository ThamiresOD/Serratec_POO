package br.org.serratec.model;

public class Atleta {
	private String nomeAtleta, posicao;

	public Atleta(String nomeAtleta, String posicao) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.posicao = posicao;
	}

	String getNomeAtleta() {
		return nomeAtleta;
	}

	void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	String getPosicao() {
		return posicao;
	}

	void setPosicao(String posicao) {
		this.posicao = posicao;
	}

}
