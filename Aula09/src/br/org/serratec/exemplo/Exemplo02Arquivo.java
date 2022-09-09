package br.org.serratec.exemplo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo02Arquivo { //C:/Users/thami/Documents/DotCode.TI/SerratecRticSW/english/EnglishVocabulary.txt
	public static void main(String[] args) {
		int vetor[] = {1, 2, 3};
		int a = 10, b = 0;
	
		try {
			FileReader fr = new FileReader("/Users/thami/Documents/DotCode.TI/SerratecRticSW/english/EnglishVocabulary.txt");
			System.out.println(" Arquivo encontrado! ");
			System.out.println(a/b);
			System.out.println(vetor[2]);
			
		} catch (FileNotFoundException e) {
			System.out.println(" Arquivo não encontrado! ");
			//e.printStackTrace();
			
		} catch (ArithmeticException e) {
			System.out.println(" Erro! Divisão por zero! ");
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Vetor fora de faixa de valor! ");
		}
	}
}
