package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exemplo0300ocalDate {
	
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		LocalDate dataEntrada = LocalDate.of(2022, 9, 12);
		
		System.out.println(data);
		System.out.println(dataEntrada);
		
		LocalDate dataConvertida = LocalDate.parse("2022-09-12");
		System.out.println(dataConvertida);
		
		System.out.println(data.plusDays(2));
		System.out.println(data.minusDays(20));
		System.out.println(data.minus(3, ChronoUnit.MONTHS));
	}

}
