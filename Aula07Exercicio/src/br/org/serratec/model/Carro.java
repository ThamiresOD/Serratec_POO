package br.org.serratec.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	protected String categoria;

	public Carro(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\n Modelo: " + modelo + "\n Data do conserto: " + dataConserto + "\n Proprietario: " + proprietario
				+ "\n Categoria:" + categoria + "\n Valor cobrado: " + valorCobrado;
	}
	// Processamento
	LocalDate date = LocalDate.from(dataConserto);

    Month mes = date.getMonth();
    DayOfWeek dia = DayOfWeek.from(date);

	@Override
	public Double lavarVeiculo() {
		return valorCobrado;
	}

	@Override
	public Double trocarOleo() {// se for no sabado tem 50.00 de desconto.
		 if(dia == DayOfWeek.TUESDAY) {
		        valorCobrado -= 50.;
		    }
		 	return valorCobrado;
		}
	
	@Override
	public Double revisao() {// agosto o cliente terá 10% de desconto na revisão.
		if(mes == Month.AUGUST) {
		valorCobrado -= valorCobrado * 0.1;
	}
		return valorCobrado;
	}
}
	

	/*
	 * public static Boolean data(LocalDate dataConserto) { DayOfWeek dw =
	 * DayOfWeek.MONDAY; if(dataConserto.getDayOfWeek().equals(dw)) { return
	 * valorCobrado -= valorCobrado * 0.1; } return valorCobrado; }
	 */
