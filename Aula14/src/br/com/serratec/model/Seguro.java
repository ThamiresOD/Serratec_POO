package br.com.serratec.model;

public class Seguro {
	private String cobertura;
	private Double valorSeguro;

	public Seguro(String cobertura, Double valorSeguro) {
		super();
		this.cobertura = cobertura;
		this.valorSeguro = valorSeguro;
	}

	@Override
	public String toString() {
		return "Seguro cobertura: " + cobertura + "\n valorSeguro: " + valorSeguro;
	}

	String getCobertura() {
		return cobertura;
	}

	Double getValorSeguro() {
		return valorSeguro;
	}

}
