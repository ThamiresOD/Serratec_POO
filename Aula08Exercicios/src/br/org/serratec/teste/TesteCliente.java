package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.org.serratec.model.Cliente;

public class TesteCliente {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		String nome = "", tel = "";
		int id = 0, idade = 0;

		while (true) {
			System.out.println(" Digite o id: ");
			id = sc.nextInt();
			if(id < 0) {
				break;
			}
			
			System.out.println(" Digite o nome: ");
			nome = sc.next();
			
			System.out.println(" Digite o idade: ");
			idade = sc.nextInt();
			
			System.out.println(" Digite o telefone: ");
			tel = sc.next();
			
			clientes.add(new Cliente(nome, tel, id, idade));
		}
		for(Cliente cliente : clientes) {
			System.out.println(cliente + "\n ------------------------------------------------ \n");
		}
		sc.close();
	}
}
