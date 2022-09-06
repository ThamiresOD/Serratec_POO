package br.org.serratec.model;

public class Imovel {
	protected String local;
	protected Double valor;
	protected Proprietario proprietario;
	
	public Imovel(String local, Double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return " Local: " + local + ", Valor: " + valor;
	}
	
	String getLocal() {
		return local;
	}
	void setLocal(String local) {
		this.local = local;
	}
	Double getValor() {
		return valor;
	}

	void setValor(Double valor) {
		this.valor = valor;
	}


	public Proprietario getProprietario() {
		return proprietario;
	}


	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	public Double calcularITBI() {
		return valor * 0.035;
	}
	
	
	
}
