package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.interfaces.AnimalCompeticao;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public String toString() {
		return "Cavalo [marcaFerradura=" + marcaFerradura + "]";
	}

	@Override
	public void trocarFerradura() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	String getMarcaFerradura() {
		return marcaFerradura;
	}

	void setMarcaFerradura(String marcaFerradura) {
		this.marcaFerradura = marcaFerradura;
	}
}
