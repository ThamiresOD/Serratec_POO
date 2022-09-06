package br.org.serratec.model;

public class Pais {
	private String pais;

	public Pais(String pais) {
		super();
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return pais;
	}


	String getPais() {
		return pais;
	}

	void setPais(String pais) {
		this.pais = pais;
	}

}
