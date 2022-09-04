package br.org.serratec.model;

public class Funcionario {
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [Nome: " + nome + ", Salario: " + salario + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double calcularINSS() {
		double inss = salario * 0.11;
		return inss;
	}

	public double calcularValeTransporte() {
		double vale = salario * 0.6;
		return vale;
	}
}
