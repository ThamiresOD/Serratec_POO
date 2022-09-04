package br.org.serratec.model;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected Integer idade;
	protected Double altura;

	public Maratona(String nome, String sexo, Integer idade, Double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	// Com Ternário
	public Boolean podeCompetir() {
		return (altura > 1.85 || idade > 18) ? true : false;
	}

}