package br.org.serratec.model;

public class Lutador {
	private String nome;
	private Double peso;
	private Integer idade;
	private Categoria categoria;
	
	public Lutador(String nome, Double peso, Integer idade, Categoria categoria) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.categoria = categoria;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	Double getPeso() {
		return peso;
	}
	void setPeso(Double peso) {
		this.peso = peso;
	}
	Integer getIdade() {
		return idade;
	}
	void setIdade(Integer idade) {
		this.idade = idade;
	}
	Categoria getCategoria() {
		return categoria;
	}
	void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
