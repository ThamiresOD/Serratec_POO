package br.com.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo0501Stream {

	public static void main(String[] args) {
		List<String> times = Arrays.asList(" Imperial ", " MIBR", " Liquid ", " NIP ");
		times.forEach(t -> System.out.println(t));
		
		// Stream - método que permite algumas tranformações, filtros e outras operações
		
		times.stream().map(t -> t.substring(0, 4)).forEach(t -> System.out.println(t));
		List<String> timesAbreviados = times.stream().map(t -> t.substring(0, 4)).collect(Collectors.toList());
		timesAbreviados.forEach(t -> System.out.println(t));
	}
}
