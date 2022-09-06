package br.org.serratec.model;

public class Time {
	private String nomeTime, nomeTreinador;
	private Atleta[] atletas;

	public Time(String nomeTime, String nomeTreinador, Atleta[] atletas) {
		this.nomeTime = nomeTime;
		this.nomeTreinador = nomeTreinador;
		this.atletas = atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	String getNomeTreinador() {
		return nomeTreinador;
	}

	void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}

	Atleta[] getAtletas() {
		return atletas;
	}

	void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void addAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}

	public void listarAtleta() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNomeAtleta());
		}
	}
}
