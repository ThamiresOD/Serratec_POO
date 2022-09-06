package br.org.serratec.teste;

import br.org.serratec.model.Apatamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Imovel;
import br.org.serratec.model.Proprietario;

public class TesteImovel {
	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario(" Thata");
		Proprietario proprietario2 = new Proprietario(" Vi");
		Imovel casa = new Casa(" Roça", 400000., true);
		Imovel apartamento = new Apatamento(" Centro", 600000., 4);
		
		casa.setProprietario(proprietario);
		apartamento.setProprietario(proprietario2);
		
		System.out.println("\n** Dados do imovel ** \n\n" + casa + casa.getProprietario());
		System.out.println("\n** Dados do imovel ** \n\n" + apartamento + apartamento.getProprietario());
	}
}
