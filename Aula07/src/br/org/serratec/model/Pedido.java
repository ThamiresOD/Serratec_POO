package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.enums.Bebida;
import br.org.serratec.enums.Sanduiche;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;
	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}
	@Override
	public String toString() {
		return  dataPedido + " | " + bebida + " + " + sanduiche;
	}
	LocalDate getDataPedido() {
		return dataPedido;
	}
	void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	Bebida getBebida() {
		return bebida;
	}
	void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	Sanduiche getSanduiche() {
		return sanduiche;
	}
	void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	public void Imprimir() {
		for (Bebida bebida : Bebida.values()) {
			System.out.println("*******************************************");
			System.out.println(bebida);
			
		}
		for (Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println("*******************************************");
			System.out.println(sanduiche);
			
		}
	}
	
}
