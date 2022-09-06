package br.org.serratec.model;

public class TotalTributos {
	private Double total = 0.0;

	Double getTotal() {
		return total;
	}

	void setTotal(Double total) {
		this.total = total;
	}

	public Double totalTributos(Tributacao t) {
		return total += t.calcularICMS() + t.calcularIR();
		

	}
	

}