package br.org.serratec.exemplo;

import java.util.Arrays;
import java.util.List;

public class Exemplo0302ListaArray {
	public static void main(String[] args) {
		
		// Não tem como add infos novas no Arrays (static)
		List<String> cores = Arrays.asList("Preto", "Azul", "Vermelho"); 
		
		// Alterar a info do indice tal
		cores.set(2, "Verde");
		
		// Verificar se possui infos
		if(cores.isEmpty()) {
			System.out.println("A lista está vazia! ");
		} else {
			System.out.println(cores);
		}
		
		// Verificar se possui uma info especifica
		System.out.println("A lista contem a cor Azul? " 
				 		+(cores.contains("Azul")? "sim" : "não"));
		 
		// Verificar se possui uma info especifica ignorando letras Maiúsculas/Minúsculas
		for(int i = 0; i < cores.size(); i++) {
		 if(cores.get(i).equalsIgnoreCase("azul")); 
		 }
		 
		// 	Não tem como mudar as infos também
		List<String> meses = List.of("Jan", "Fev", "Mar");
		System.out.println(meses);
	}

}
