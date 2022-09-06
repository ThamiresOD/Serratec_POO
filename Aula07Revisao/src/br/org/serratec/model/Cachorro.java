package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.interfaces.AnimalDomestico;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	@Override
	public Boolean levarVeterinario() {
		return null;
	}

	@Override
	public Boolean alimentar() {
		return null;
	}

	@Override
	public void amamentar() {
	}

	@Override
	public String emitirSom() {
		return null;
	}

	Boolean getCastrado() {
		return castrado;
	}

	void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

}
