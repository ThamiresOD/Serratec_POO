package br.org.serratec.control;

import br.org.serratec.model.PlanoDeSaude;

public class ControlePagamento {
	
		private Double totalGeral = 0.;

		public Double getTotalGeral() {
			return totalGeral;
		}

		public void setTotalGeral(Double totalGeral) {
			this.totalGeral = totalGeral;
		}

		public void calcularTotalPago(PlanoDeSaude plano) {
			totalGeral += plano.getValorPago();
		}
		
}

