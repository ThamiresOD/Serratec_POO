package br.org.serratec.model;

import br.org.serratec.exception.ContaException;
import br.org.serratec.interfaces.Conta;

public class Poupanca implements Conta {
	private String titular;
	private Double saldo;

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return " Poupanca titular: " + titular + "\n saldo:" + saldo;
	}

	String getTitular() {
		return titular;
	}

	Double getSaldo() {
		return saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		throw new ContaException(" Saldo insuficiente! ");
	}

	@Override
	public Boolean deposito(Double valor) throws RuntimeException  {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		throw new ContaException(" Valor de depósito inválido! "); 
	}

}
