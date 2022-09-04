package br.org.serratec.model;

public class Produto {
	private Integer produto;
	private String descricao;
	private Double valor;
	private static int totalProdutos;

	public Produto(Integer produto, String descricao, Double valor) {
		super();
		this.produto = produto;
		this.descricao = descricao;
		this.valor = valor;
		totalProdutos++;
	}

	public Integer getProduto() {
		return produto;
	}

	public void setProduto(Integer produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
	

}
