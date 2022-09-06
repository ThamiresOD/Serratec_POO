package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.interfaces.Oficina;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	
	public Veiculo(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return " modelo: " + modelo + " Valor: " + valorCobrado + "Data: " + dataConserto + proprietario;
	}
	Double getValorCobrado() {
		return valorCobrado;
	}

}
