package br.org.serratec.model;

public class VeiculoPasseio extends Veiculo {
	private Integer quantidadePortas;

	public VeiculoPasseio(String chassi, String placa, String cor, Double valor, Integer quantidadePortas) {
		super(chassi, placa, cor, valor);
		this.quantidadePortas = quantidadePortas;
	}

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}
	
	
}
