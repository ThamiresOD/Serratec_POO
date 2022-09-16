package br.com.serratec.model;

import br.com.serratec.interfaces.Conta;

public class ContaCorrente implements Conta{

	@Override
	public void transacao() {
		System.out.println(" Transação OK! ");
	}

	@Override
	public void investimento() {
		System.out.println(" Investimento Ok! ");
	}
}
