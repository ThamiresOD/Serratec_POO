package br.org.serratec.teste;

public class TesteString {
	public static void main(String[] args) {
		String texto = null;
		
		try {
			texto = texto.toUpperCase();
			System.out.println(texto);
		} catch (NullPointerException e) {
			System.out.println("Erro! Vazio ");
		}
	}
}
