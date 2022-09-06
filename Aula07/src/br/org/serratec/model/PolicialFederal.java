package br.org.serratec.model;

public class PolicialFederal extends Policial {
	private final String lotacao;

	public PolicialFederal(String nome, String matricula, String lotacao) {
		super(nome, matricula);
		this.lotacao = lotacao;
		
		
	}

	String getLotacao() {
		return lotacao;
	}
}
