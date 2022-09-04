package br.org.serratec.model;

public class Assistente extends Funcionario {
	private String tipo;

	public Assistente(String cpf, String nome, Double salario, String tipo) {
		super(cpf, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
