package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.enums.TipoServico;

public class Moto extends Veiculo {
	public int cilindradas;

	public Moto(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();

	}

	@Override
	public Double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}

}