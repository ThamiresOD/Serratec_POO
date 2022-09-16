package br.org.serratec.generico;

public class MeuGenerico <T> {
	
	private T valor;

	public MeuGenerico(T valor) {
		this.valor = valor;
	}
	
	public MeuGenerico(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MeuGenerico [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}

	
}
