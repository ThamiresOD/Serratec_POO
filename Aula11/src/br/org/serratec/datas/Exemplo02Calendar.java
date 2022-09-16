package br.org.serratec.datas;

import java.util.Calendar;

public class Exemplo02Calendar {
	
	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		System.out.println(data);
		System.out.println(data.get(Calendar.DAY_OF_MONTH));
		System.out.println(data.get(Calendar.HOUR));
	}

}
