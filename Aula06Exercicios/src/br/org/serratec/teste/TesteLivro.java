package br.org.serratec.teste;

import br.org.serratec.model.Livro;
import br.org.serratec.model.Operacao;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro l2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98.);		

		Operacao op1 = new Operacao("venda", l1);
		Operacao op2 = new Operacao("emprestimo", l2);
			
		l1.reajuste(1.06);
		op1.venderLivro();
		op2.emprestarLivro();
		
		
		System.out.println(op1.toString());
		System.out.println(op2.toString());
		
	}
}
