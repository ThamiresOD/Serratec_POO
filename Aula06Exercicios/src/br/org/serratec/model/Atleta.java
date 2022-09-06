package br.org.serratec.model;

public class Atleta {
	private String nome, modalidade;
	private Integer idade, i;
	private Double peso, altura, invergadura;
	protected Pais pais;
	
	public Atleta(String nome, String modalidade, Integer idade, Double peso, Double altura, Double invergadura,
			Pais pais) {
		super();
		this.nome = nome;
		this.modalidade = modalidade;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.invergadura = invergadura;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "\n --> Atleta: " + nome + "\n Modalidade: " + modalidade + "\n Idade: " + idade + "\n Peso: " + peso
				+ "\n Altura: " + altura + "\n Invergadura: " + invergadura + "\n País: " + pais;
	}

	String getNome() {
		return nome;
	}

	public Integer getI() {
		return i;
	}

	String getModalidade() {
		return modalidade;
	}

	Integer getIdade() {
		return idade;
	}

	Double getPeso() {
		return peso;
	}

	Double getAltura() {
		return altura;
	}

	Double getInvergadura() {
		return invergadura;
	}

	Pais getPais() {
		return pais;
	}
	
	public String luta() {
			if(peso > 60.) {
				return " Categoria Pena - Luta confirmada! ";
			}
			return " Fora da categoria!";
	}
}
