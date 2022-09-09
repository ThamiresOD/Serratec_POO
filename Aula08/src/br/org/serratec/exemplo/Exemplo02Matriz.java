package br.org.serratec.exemplo;

public class Exemplo02Matriz {

	public static void main(String[] args) {
		String pessoas[][] = 
			{{"Thata ", " CM "},
			{"Vi ", " Civ "},
			{"Cait ", " Civ "},
			{"Ashe", " Maj "}
			};
		
		for(int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("****************");
			for(int coluna = 0; coluna < pessoas[linha].length; coluna++) {
				System.out.println(pessoas[linha][coluna]);
			}
		}
	}
}
