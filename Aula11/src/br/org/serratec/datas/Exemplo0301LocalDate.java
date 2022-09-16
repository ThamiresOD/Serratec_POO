package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo0301LocalDate {
	
	public static void main(String[] args) {
		LocalDate dataNasc = LocalDate.of(1950, 6, 15);
		LocalDate dataAtual = LocalDate.now();
		
		Period period = Period.between(dataNasc, dataAtual);
		System.out.println(" Idade: " + period.getYears() + " anos.");
	}

}
