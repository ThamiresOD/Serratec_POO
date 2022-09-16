package br.org.serratec.datas;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exemplo04Horas {
	
	public static void main(String[] args) {
		LocalTime hora = LocalTime.of(22, 05);
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println(hora.plusHours(2));
		System.out.println(horaAtual.plusMinutes(28));
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
	
	}
}
