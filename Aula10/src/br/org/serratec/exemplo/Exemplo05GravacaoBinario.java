package br.org.serratec.exemplo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exemplo05GravacaoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream gravar = new FileOutputStream("/exemplos/teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("JAVA - POO !");
			gravarArquivo.close();
			
		} catch (Exception e){
			System.out.println("Erro na gravação de arquivo");
		}
	}
}
