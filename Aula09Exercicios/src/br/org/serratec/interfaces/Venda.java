package br.org.serratec.interfaces;

import java.time.LocalDate;

import br.org.serratec.model.Produto;

public class Venda implements FinalizarVenda {

	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda = 0.;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return produto + " - Data da Compra:" + dataCompra + " - Quantidade:" + quantidade + " - TotalVenda:";
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += quantidade * produto.getValor();
	}

	public double mostrarVenda() {
		return produto.getValor() * quantidade;
	}

}
