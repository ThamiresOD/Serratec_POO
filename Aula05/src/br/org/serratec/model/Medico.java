package br.org.serratec.model;

public class Medico extends PlanoDeSaude {
	private Integer crm;
	private String nome;
	
	public Medico(String empresa, Double valorPago, Double valorISS, Integer crm, String nome) {
		super(empresa, valorPago, valorISS);
		this.crm = crm;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Medico crm: " + crm + ", nome: " + nome;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public Double calcularPagamento() {
		return valorPago= super.calcularPagamento() * 1.10;
	}
	

}
