package br.org.serratec.teste;

import br.org.serratec.enums.MarcaTV;
import br.org.serratec.model.TV;

public class TesteTV {
	public static void main(String[] args) {
		TV tv = new TV("SN/2343", 42., MarcaTV.PHILCO);
		System.out.println(tv);
	}
}
