package br.org.serratec.teste;

public class Atleta {
	private String nome, posicao;
	private int idade;

	public Atleta(String nome, String posicao, int idade) {
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
		
	}

	@Override
	public String toString() {
		return "\n -------------------------------------------\n -> " + nome + " - " + posicao + " - " + idade + " anos";
	}

	String getNome() {
		return nome;
	}

	String getPosicao() {
		return posicao;
	}

	int getIdade() {
		return idade;
	}

}
