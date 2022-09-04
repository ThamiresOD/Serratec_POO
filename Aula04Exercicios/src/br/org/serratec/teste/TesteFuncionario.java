package br.org.serratec.teste;

import javax.swing.JOptionPane;
import br.org.serratec.model.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Romulo", 15000.);
		funcionario.calcularINSS();
		funcionario.calcularValeTransporte();

	/*	// Saida de dados:
		JOptionPane.showMessageDialog(null,
				" Nome: " + funcionario.getNome() 
				+ " Salário: " + funcionario.getSalario() 
				+ " INSS: " + funcionario.calcularINSS() 
				+ " Vale Transporte: " + funcionario.calcularValeTransporte()
				+ " Salário Líquido: " + (funcionario.getSalario() - funcionario.calcularINSS()));
		*/
	}
}
