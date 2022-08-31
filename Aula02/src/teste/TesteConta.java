package teste;

import model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.numeroConta = 1234;
		conta1.titular = "Thamires";
		conta1.saldo = 300.00;

		Conta conta2 = new Conta();
		conta2.numeroConta = 234;
		conta2.titular = "Rômulo";
		conta2.saldo = 5000.00;
	
		// Depósito de 500,00
		conta1.deposito(500.00);
		conta2.deposito(100.00);

		// Saque de 200,00
		if (conta1.saque(200.00)) {
			System.out.println("Saque efetuado com sucesso !");
		}else{
			System.out.println("Não tem dinheiro");
		}
		
		//Imprimir Saldo
		System.out.println("Saldo Conta1:"+conta1.saldo);
		System.out.println("Saldo Conta2:"+conta2.saldo);
	}
}