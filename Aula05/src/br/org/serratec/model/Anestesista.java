package br.org.serratec.model;

public class Anestesista extends Medico {
	private String tipoAnestesista;

	public Anestesista(String empresa, Double valorPago, Double valorISS, Integer crm, String nome,
			String tipoAnestesista) {
		super(empresa, valorPago, valorISS, crm, nome);
		this.tipoAnestesista = tipoAnestesista;
	}

	String getTipoAnestesista() {
		return tipoAnestesista;
	}

	void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}

}
