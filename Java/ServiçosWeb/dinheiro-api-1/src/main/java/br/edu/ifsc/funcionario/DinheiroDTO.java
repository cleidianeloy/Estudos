package br.edu.ifsc.funcionario;

public class DinheiroDTO {
	private double valor;
	private String operacao;
	private double dolarComercial;
	private double dolarParalelo;
	private double dolarPTAX;
	private double dolarTurismo;
	private double euro;
	private double ouro;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public double getDolarComercial() {
		return dolarComercial;
	}
	public void setDolarComercial(double dolarComercial) {
		this.dolarComercial = dolarComercial;
	}
	public double getDolarParalelo() {
		return dolarParalelo;
	}
	public void setDolarParalelo(double dolarParalelo) {
		this.dolarParalelo = dolarParalelo;
	}
	public double getDolarPTAX() {
		return dolarPTAX;
	}
	public void setDolarPTAX(double dolarPTAX) {
		this.dolarPTAX = dolarPTAX;
	}
	public double getDolarTurismo() {
		return dolarTurismo;
	}
	public void setDolarTurismo(double dolarTurismo) {
		this.dolarTurismo = dolarTurismo;
	}
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getOuro() {
		return ouro;
	}
	public void setOuro(double ouro) {
		this.ouro = ouro;
	}
	public DinheiroDTO(double valor, String operacao, double dolarComercial, double dolarParalelo, double dolarPTAX,
			double dolarTurismo, double euro, double ouro) {
		super();
		this.valor = valor;
		this.operacao = operacao;
		this.dolarComercial = dolarComercial;
		this.dolarParalelo = dolarParalelo;
		this.dolarPTAX = dolarPTAX;
		this.dolarTurismo = dolarTurismo;
		this.euro = euro;
		this.ouro = ouro;
	}
	
}
