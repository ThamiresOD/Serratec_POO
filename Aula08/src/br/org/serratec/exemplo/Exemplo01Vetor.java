package br.org.serratec.exemplo;

public class Exemplo01Vetor {

	public static void main(String[] args) {
		
		String[] vetor = new String[3];
			vetor[0] = "Thata";
			System.out.println(vetor[0]);
			
	//	String[] meses = new String[] {"Janeiro", "Fevereiro", "Março"};
		String[] meses = {"Jan", "Fev", "Mar"};
		
		for (String mes : meses) {
			System.out.println(mes);
		}
	}
}

