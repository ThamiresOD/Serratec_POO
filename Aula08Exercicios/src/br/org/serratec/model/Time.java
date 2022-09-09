package br.org.serratec.model;

import java.util.List;

import br.org.serratec.teste.Atleta;

public class Time {
	private String nome, tecnico, diretor;
	private List<Atleta> atletas;

	public Time(String nome, String tecnico, String diretor, List<Atleta> atletas) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "\n -> " + nome + "-------------------------" + "\n Técnico: " + tecnico + "\n Diretor: " + diretor + "\n Atletas: " + atletas + "\n\n";
	}

	String getNome() {
		return nome;
	}

	String getTecnico() {
		return tecnico;
	}

	String getDiretor() {
		return diretor;
	}

	List<Atleta> getAtletas() {
		return atletas;
	}

}
