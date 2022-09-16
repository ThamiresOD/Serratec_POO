package br.org.serratec.teste;

import br.org.serratec.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("12546", " VI");
//		Empregado empregado2 = new Empregado("12546", " VI");
		Empregado empregado2 = new Empregado("15748", " Cait");
		
		if(empregado1.equals(empregado2)) {
			System.out.println("Iguais! ");
		} else {
			System.out.println(" Diferentes! ");
		}
	}
}
