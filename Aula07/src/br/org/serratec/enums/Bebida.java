package br.org.serratec.enums;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 6.00),
	AGUA("Água", 2.5),
	SUCO("Suco de Laranja", 7.0),
	CERVEJA("Cerveja", 8.);

	private String tipo;
	private Double valor;
	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	String getTipo() {
		return tipo;
	}
	void setTipo(String tipo) {
		this.tipo = tipo;
	}
	Double getValor() {
		return valor;
	}
	void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return tipo + " R$: " +valor;
	}
}
