package br.org.serratec.teste;

import java.time.LocalDate;

import br.org.serratec.enums.Bebida;
import br.org.serratec.enums.Sanduiche;
import br.org.serratec.model.Pedido;

public class TestePedido {
	public static void main(String[] args) {
		Pedido p1 = new Pedido(LocalDate.now(), Bebida.AGUA, Sanduiche.HAMBURGUER);
		Pedido p2 = new Pedido(LocalDate.now(), Bebida.CERVEJA, null);
		Pedido p3 = new Pedido(LocalDate.now(), Bebida.SUCO, Sanduiche.MISTO);
		
		System.out.println("\n\n---------------------------- Pedidos ---------------------------- \n\n 1 - " + p1 
				+ "\n 2 - " + p2 
				+ "\n 3 - " + p3);
		
	}
}
