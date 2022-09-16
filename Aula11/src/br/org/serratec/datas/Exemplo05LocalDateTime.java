package br.org.serratec.datas;

import java.time.Duration;
import java.time.LocalDateTime;

public class Exemplo05LocalDateTime {
	
	public static void main(String[] args) {
		LocalDateTime firstPeriod = LocalDateTime.now();
		LocalDateTime secondPeriod = LocalDateTime.of(2022, 10, 15, 00, 00);

		Duration duration = Duration.between(firstPeriod, secondPeriod);
		Long dia = duration.toDays();
		Long hora = duration.toHours();
		Long min = duration.toMinutes();
		Long seg = duration.toSeconds();
		System.out.println("\n\n --> Faltam " + dia + " dias - " + hora + " horas - " + min + " minutos - " + seg + " segundos para o nosso niver!! ");
		
		if(duration.getSeconds() < 30000000000.) {
			System.out.println(" Foi ");
		}
		
	}
}
