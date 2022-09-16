package br.com.serratec.model;

public class Categoria {
	private Integer codigo;
	private String nomeCategoria;

	public Categoria(Integer codigo, String nomeCategoria) {
		super();
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", nomeCategoria=" + nomeCategoria + "]";
	}

	Integer getCodigo() {
		return codigo;
	}

	String getNomeCategoria() {
		return nomeCategoria;
	}
}
