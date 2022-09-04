package br.org.serratec.model;

public class Veiculo {
	protected String chassi;
	protected String placa;
	protected String cor;
	protected Double valor;
	protected Double ipva;

	public Veiculo(String chassi, String placa, String cor, Double valor) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return chassi + "\n" + placa + "\n" + cor + "\n" + valor;
	}

	public String getChassi() {
		return chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public Double getValor() {
		return valor;
	}

	public Double getIpva() {
		return ipva;
	}

	public void calcularIPVA() {
		ipva = valor * 0.04;
	}

}
