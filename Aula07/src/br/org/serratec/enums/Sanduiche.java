package br.org.serratec.enums;

public enum Sanduiche {
	HAMBURGUER("Hamburguer ", 20.0), 
	MISTO("Misto Quente", 8.), 
	HOTDOG("Cachorro Quente", 12.);

	private String tipoSanduiche;
	private Double valor;

	private Sanduiche(String tipoSanduiche, Double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	String getTipoSanduiche() {
		return tipoSanduiche;
	}

	void setTipoSanduiche(String tipoSanduiche) {
		this.tipoSanduiche = tipoSanduiche;
	}

	Double getValor() {
		return valor;
	}

	void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return tipoSanduiche + " R$: " + valor;
	}

}
