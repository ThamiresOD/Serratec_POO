package br.org.serratec.model;

public class Apatamento extends Imovel {
	private Integer andar;

	public Apatamento(String local, Double valor, Integer andar) {
		super(local, valor);
		this.andar = andar;
	}
	
	

	@Override
	public String toString() {
		return " Apatamento no andar: " + andar + "\n" + " Local: " + local;
	}



	Integer getAndar() {
		return andar;
	}

	void setAndar(Integer andar) {
		this.andar = andar;
	}
	
	
}
