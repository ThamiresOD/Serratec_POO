package teste;

import model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("--------------------");
		// Instancia de um objeto
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = aluno2;

		aluno1.matricula = 123;
		aluno1.nome = "Carlos";
		aluno3.nome = "Thamires";
		

		System.out.println("Aluno1: " + aluno1.nome + " matricula " + aluno1.matricula);
		System.out.println("Aluno2: " + aluno2);
		

		String resp1 = aluno1 == aluno2 ? "Objetos iguais! " : "Objetos diferentes! ";
		System.out.println(resp1);
		
	}
}
