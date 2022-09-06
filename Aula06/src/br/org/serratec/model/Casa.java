package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}
	

	@Override
	public String toString() {
		return " Com garagem: " + (garagem ? " sim \n" : " não \n") + " Local: " + local + "\n Valor: " + valor;
	}


	Boolean getGaragem() {
		return garagem;
	}

	void setGaragem(Boolean garagem) {
		this.garagem = garagem;
	}
	
	
	

}
