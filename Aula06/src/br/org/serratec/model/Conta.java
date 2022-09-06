package br.org.serratec.model;

// Nao pode ter instancia/implementacao e ja eh implicito que eh public
// Variaveis tbm sao sempre static e obrigatoriamente devem ser inicializadas
public interface Conta {
	Double taxaBancaria = 2.50;
	
	Boolean saque(Double valor);
	Boolean deposito(Double valor);

}
