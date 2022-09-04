package br.org.serratec.model;

public class Caminhao extends Veiculo {
	private Integer cargaMaxima;

	public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}
	
	@Override
	public void calcularIPVA() {
		ipva = valor * 0.08;
	}
}