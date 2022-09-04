package br.org.serratec.model;

public class Calculadora {
	private Double valor1, valor2, resultado;
	private int opcao;
	
	

	public Calculadora(Double valor1, Double valor2, Double resultado, int opcao) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.resultado = resultado;
		this.opcao = opcao;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	// Metodos
	
	public void Calcular() {
		Switch (opcao) {
			
		}
	}
/*	public void Calcular() {
		opcao = 0;
		Switch (opcao) {
			
			case 1:
				resultado = valor1 + valor2;
				break;
			case 2:
				resultado = valor1 - valor2;
				break;
			case 3:
				resultado = valor1 * valor2;
				break;
			case 4:
				resultado = valor1 / valor2;
				break;
			default:			
				break;
		}
		return resultado;

	}*/
}
