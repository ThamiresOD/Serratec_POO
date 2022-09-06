package br.org.serratec.model;

public class Livro {
	private String autor, titulo;
	protected Double valor;

	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return " titulo: " + titulo + "\n Autor: " + autor;
	}

	String getAutor() {
		return autor;
	}

	String getTitulo() {
		return titulo;
	}

	Double getValor() {
		return valor;
	}

	public void reajuste(double valorReajuste) {
		valor *= valorReajuste;

	}

}
