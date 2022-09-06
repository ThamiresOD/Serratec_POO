package br.org.serratec.model;

public class Luta {
	private Lutador desafiante, desafiado;
	private Boolean confirmado;
	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmado) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmado = confirmado;
	}
	Lutador getDesafiante() {
		return desafiante;
	}
	void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	Lutador getDesafiado() {
		return desafiado;
	}
	void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	Boolean getConfirmado() {
		return confirmado;
	}
	void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
	}
	
	public Boolean confirmacaoLuta() {
		if(!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		}
	return false;
	}

}
