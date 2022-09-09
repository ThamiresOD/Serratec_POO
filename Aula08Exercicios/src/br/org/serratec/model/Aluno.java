package br.org.serratec.model;

public class Aluno {
    String nome;
    Double nota1, nota2;

    public Aluno(String nome, Double nota1, Double nota2) {
        super();
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
	public String toString() {
		return "Aluno: " + nome + " | nota 1: " + nota1 + " | nota 2: " + nota2;
	}

	public String getNome() {
        return nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double calcularMedia() {
        return (nota1 + nota2) / 2;

    }

}