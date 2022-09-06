package br.org.serratec.model;

// Abstract = calsse nao pode ser instanciada
public abstract class Empregado {
	private String cpf, nome;
	private Double salario;
	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empregado [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	Double getSalario() {
		return salario;
	}
	void setSalario(Double salario) {
		this.salario = salario;
	}
	// Assinatura de metodo abstrato
	public abstract void alumentarSalario();
	
	
}
