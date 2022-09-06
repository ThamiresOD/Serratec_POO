package br.org.serratec.model;

import br.org.serratec.enums.MarcaTV;

public class TV {
	private String modelo;
	private Double tamanho;
	private MarcaTV marca;

	public TV(String modelo, Double tamanho, MarcaTV marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "TV modelo: " + modelo + ", tamanho: " + tamanho + ", marca: " + marca;

	}

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	Double getTamanho() {
		return tamanho;
	}

	void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	MarcaTV getMarca() {
		return marca;
	}

	void setMarca(MarcaTV marca) {
		this.marca = marca;
	}

}
