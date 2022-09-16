package br.org.serratec.exemplo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.model.Empregado;

public class Exemplo04Empregado {
	public static void main(String[] args) {
		
		File arquivo = new File("/exemplos/empregado.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			Set<Empregado> empregados = new HashSet<>();
			
			System.out.println("\n ---------- Leitura do arquivo -------------");
			while(sc.hasNextLine()) {
				String linha = sc.nextLine();
				if(!linha.isEmpty()) {
				 	String vetor[] = linha.split(";");
				 	empregados.add(new Empregado(vetor[0], vetor[1]));
				}
			}
			sc.close();
			
			System.out.println("\n ---------- Dados do arquivo ---------------");
			for(Empregado empregado : empregados) {
				System.out.println(empregado);
			}
			System.out.println("\n ---------- Gravação do Arquivo -------------");
			FileWriter arquivoGravar = new FileWriter("/exemplos/empregados-gravar.txt");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (Empregado empregado : empregados) {
				String linha = empregado.getCpf()+";"+empregado.getNome() +"\n";
				gravacaoArquivo.printf(linha);
			}
			System.out.println("Arquivo gravado com sucesso !!");
			gravacaoArquivo.close();
					
		} catch (IOException e) {
			System.out.println(" Não Funcionou! ");
			e.printStackTrace();
			
		}
	}
}
