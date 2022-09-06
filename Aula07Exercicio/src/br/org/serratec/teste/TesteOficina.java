package br.org.serratec.teste;

import java.time.LocalDate;
import br.org.serratec.enums.TipoServico;
import br.org.serratec.model.Carro;
import br.org.serratec.model.Proprietario;

public class TesteOficina {
	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Ricardo");
		
		Carro c1 = new Carro("Off Road",
				TipoServico.REVISAO.getValorPorServico(),
				LocalDate.of(2022,8,6),
				p1, " voador ");
		
		c1.revisao();
		
		System.out.println(c1.toString());
	}
}