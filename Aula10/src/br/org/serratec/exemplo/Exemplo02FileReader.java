package br.org.serratec.exemplo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exemplo02FileReader {
	
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("/exemplos/leitura.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(" Arquivo não encontrado! ");
		}
	
	}

}
