package br.org.serratec.model;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;
	
	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return " Titular: " + titular + "\n Saldo: " + saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if (saldo > valor) {
			saldo -= valor + taxaBancaria;
			return true;
		}
		return false;

	}

	@Override
	public Boolean deposito(Double valor) {
		if (valor > 0 && valor < 10000) {
			saldo += valor;;
			return true;
		}
		return false;

	}

}
