package br.org.serratec.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo01Date {

	public static void main(String[] args) {
	
		Date data = new Date();
		System.out.println(data);
		System.out.println(data.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = sdf.format(data);
		System.out.println(dataFormatada);

	}

}
