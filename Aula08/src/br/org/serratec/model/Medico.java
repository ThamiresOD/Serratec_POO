package br.org.serratec.model;

public class Medico {
	private String crm, nome;
	private Double valorConsulta;

	public Medico(String crm, String nome, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}

	@Override
	public String toString() {
		return "Exemplo0303ListaMedico [crm=" + crm + ", nome=" + nome + ", valorConsulta=" + valorConsulta + "]";
	}

	String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}


}
