package br.org.serratec.model;

public class Operacao implements Livraria{
	private String tipo;
	private Double valorOperacao;
	protected Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "\n --> Operacao tipo: " + tipo + "\n Livro " + livro + "\n Valor: " + valorOperacao;
	}

	String getTipo() {
		return tipo;
	}

	void setTipo(String tipo) {
		this.tipo = tipo;
	}

	Double getValorOperacao() {
		return valorOperacao;
	}

	void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
		
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() + (livro.getValor() * 0.09);		
		
	}

}
