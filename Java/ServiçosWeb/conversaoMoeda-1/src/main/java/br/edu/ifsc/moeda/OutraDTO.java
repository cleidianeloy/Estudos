package br.edu.ifsc.moeda;

public class OutraDTO {
		private String moeda;
		private double compra;
		private double venda;
		public String getMoeda() {
			return moeda;
		}
		public void setMoeda(String moeda) {
			this.moeda = moeda;
		}
		public double getCompra() {
			return compra;
		}
		public void setCompra(double compra) {
			this.compra = compra;
		}
		public double getVenda() {
			return venda;
		}
		public void setVenda(double venda) {
			this.venda = venda;
		}
		public OutraDTO(String moeda, double compra, double venda) {
			super();
			this.moeda = moeda;
			this.compra = compra;
			this.venda = venda;
		}
		
}
