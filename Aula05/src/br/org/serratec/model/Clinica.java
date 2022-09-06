package br.org.serratec.model;

public class Clinica extends PlanoDeSaude {
	private String razaoSocial, cnpj;

	public Clinica(String empresa, Double valorPago, Double valorISS, String razaoSocial, String cnpj) {
		super(empresa, valorPago, valorISS);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Clinica razaoSocial: " + razaoSocial + ", cnpj: " + cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
