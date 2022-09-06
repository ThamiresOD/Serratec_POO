package Aula02Exercicios;

import javax.swing.JOptionPane;

public class Aula02Exercicio04 {

	public static void main(String[] args) {
		double s = 0;
		
		//Entrada de dados
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
		String salario = JOptionPane.showInputDialog("Digite o salario: ");
		
		Double tel = Double.parseDouble(telefone);
		Double sal = Double.parseDouble(salario);
		

		//Processamento
		s += (sal * 0.1);
		
		//Saida de dados
		System.out.printf(" Nome: " + nome + "\n Telefone: " + telefone + "\n Salário + 10%: " + s);
		
	}
}
