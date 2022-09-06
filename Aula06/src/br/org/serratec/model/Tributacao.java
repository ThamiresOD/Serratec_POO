package br.org.serratec.model;

public interface Tributacao extends Taxas, ImpostoRenda{
	public Double calcularICMS();
}
 