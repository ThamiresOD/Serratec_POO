package br.com.serratec.exemplos;

import br.com.serratec.interfaces.Conta;

public class Exemplo01TesteConta {

	public static void main(String[] args) {

		// Classe anônima baseada em uma interface
		Conta conta = new Conta() {

			@Override
			public void transacao() {
				System.out.println(" Transação efetuada! ");
			}
		};
		conta.transacao();
		
		// ()-> Lambda
		// Programacao Funcional - ( Para a interface ser funcional ela somente pode ter 1 assinatura(metodo)
		Conta conta2 = ()-> System.out.println(" Transação efetuada conta2 ");
		conta2.transacao();
		
	} 
}
