package br.edu.ifsc.funcionario;

public class Dinheiro {
	
	public String moeda;
	public double compra;
	public double venda;
	
	//alt + shift+ s
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
	public Dinheiro(String moeda, double compra, double venda) {
		super();
		this.moeda = moeda;
		this.compra = compra;
		this.venda = venda;
	}
	
}

