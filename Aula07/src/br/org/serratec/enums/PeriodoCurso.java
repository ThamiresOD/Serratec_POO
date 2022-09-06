package br.org.serratec.enums;

public enum PeriodoCurso {
	TARDE("Terça e Quinta", 40, 2500.), 
	NOTURNO("Segunda e Quarta", 20, 1000.), 
	INTEGRAL("Sexta", 80, 5200.); 
	
	//Um construtor no enum eh privado e serve para organizar a ordem de insercao dos campos
	
	private String diasSemana;
	private Integer cargaHoraria;
	private Double valor;
	private PeriodoCurso(String diasSemana, Integer cargaHoraria, Double valor) {
		this.diasSemana = diasSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	public String getDiasSemana() {
		return diasSemana;
	}
	void setDiasSemana(String diasSemana) {
		this.diasSemana = diasSemana;
	}
	Integer getCargaHoraria() {
		return cargaHoraria;
	}
	void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	Double getValor() {
		return valor;
	}
	void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
