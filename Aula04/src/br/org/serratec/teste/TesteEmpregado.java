package br.org.serratec.teste;

import br.org.serratec.model.CalcularSalario;
import br.org.serratec.model.Empregado;
import br.org.serratec.model.Programador;
import br.org.serratec.model.Tecnico;

public class TesteEmpregado {

	public static void main(String[] args) {

		// Empregado e1 = new Empregado("Mario", "mario@gmail.com", 2000.00);

		Tecnico t1 = new Tecnico("Mario", "mario@gmail.com", 2000.00);
		Programador p1 = new Programador("Ana", "ana@gmail.com", 6000., "Python");
		Empregado e1 = t1;
		e1 = t1;
		System.out.println(t1);
		
		CalcularSalario cs = new CalcularSalario();
		cs.folhaPag(t1);
	}

}
