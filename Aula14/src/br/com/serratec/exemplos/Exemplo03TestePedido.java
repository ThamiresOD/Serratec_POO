package br.com.serratec.exemplos;

import br.com.serratec.model.Pedido;

public class Exemplo03TestePedido {
	
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();
		pedido1.finalizarPedido();
		
		// Classe anônima - 
		Pedido pedido2 = new Pedido() {
			@Override
			public void finalizarPedido() {
				System.out.println(" Pedido enviado com sucesso! ");
			}
		};
		pedido2.finalizarPedido();
		
		Pedido pedido3 = new Pedido() {
		
		};
	}
}
