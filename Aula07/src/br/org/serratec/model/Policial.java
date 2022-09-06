package br.org.serratec.model;

// Final class = Essa classe nao podera ter filhos / imutavel
//public final class Policial {

public class Policial {
	private String nome, matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getMatricula() {
		return matricula;
	}

	void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
