package br.org.serratec.enums;

public enum EstadoCivil {
	SOLTEIRO('S'), CASADO('C'), VIUVO('V'), DIVORCIADO('D');
	
	private char estado;

	private EstadoCivil(char estado) {
		this.estado = estado;
	}

	char getEstado() {
		return estado;
	}
	
}