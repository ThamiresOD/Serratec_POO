package br.org.serratec.model;

public class Empresa implements Tributacao {
	private String razaoSocial;
	private Double rendimentos;

	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return " Empresa - RazaoSocial: " + razaoSocial + "\n Rendimentos: " + rendimentos;
	}

	String getRazaoSocial() {
		return razaoSocial;
	}

	void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	Double getRendimentos() {
		return rendimentos;
	}

	void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public Double calcularIR() {
		return rendimentos * ipj;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * icms;
	}

}
