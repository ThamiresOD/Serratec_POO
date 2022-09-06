package br.org.serratec.model;

public class PlanoDeSaude {
	protected String empresa;
	protected Double valorPago, valorISS;
	
	public PlanoDeSaude(String empresa, Double valorPago, Double valorISS) {
		super();
		this.empresa = empresa;
		this.valorPago = valorPago;
		this.valorISS = valorISS;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Double getValorISS() {
		return valorISS;
	}

	public void setValorISS(Double valorISS) {
		this.valorISS = valorISS;
	}
	
	public Double calcularPagamento() {
		valorPago = valorPago - valorPago * valorISS / 100;
		return valorPago;
	}

}
