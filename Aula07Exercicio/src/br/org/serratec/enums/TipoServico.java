package br.org.serratec.enums;

public enum TipoServico {
	OLEO(100.), LAVAGEM(50.), REVISAO(200.);

	private Double valorPorServico;

	private TipoServico(Double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	@Override
	public String toString() {
		return " Valor do Servico:" + valorPorServico;
	}

	public Double getValorPorServico() {
		return valorPorServico;
	}


}
