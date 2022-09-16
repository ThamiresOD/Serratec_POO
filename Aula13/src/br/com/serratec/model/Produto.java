package br.com.serratec.model;

public class Produto {
	private Integer codigo, quatidadeEstoque;
	private String descricao;
	private Double preco;
	private Categoria categoria;

	public Produto(Integer codigo, Integer quatidadeEstoque, String descricao, Double preco, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.quatidadeEstoque = quatidadeEstoque;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", quatidadeEstoque=" + quatidadeEstoque + ", descricao=" + descricao
				+ ", preco=" + preco + ", categoria=" + categoria + "]";
	}

	Integer getCodigo() {
		return codigo;
	}

	Integer getQuatidadeEstoque() {
		return quatidadeEstoque;
	}

	String getDescricao() {
		return descricao;
	}

	Double getPreco() {
		return preco;
	}

	Categoria getCategoria() {
		return categoria;
	}

}
