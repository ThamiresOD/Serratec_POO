package br.org.serratec.model;

// Heranca entre classes
public class Gerente extends Funcionario {
	private String tipo;

	public Gerente(String cpf, String nome, Double salario, String tipo) {
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
