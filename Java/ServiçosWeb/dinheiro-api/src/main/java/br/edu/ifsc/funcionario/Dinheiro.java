package br.edu.ifsc.funcionario;

public class Dinheiro {
//	Dólar comercial (DC) R$ 5,6061 R$ 5,6066
//	Dólar paralelo (DP) R$ 5,69 R$ 5,79
//	Dólar PTAX (DX) R$ 5,6058 R$ 5,6064
//	Dólar turismo (DT) R$ 5,5430 R$ 5,7530
//	Euro (EU) R$ 6,5630 R$ 6,8070
//	Ouro (OU) R$ 346,70 +1,88%
	
	private double dolarComercial;
	private double dolarParalelo;
	private double dolarPTAX;
	private double dolarTurismo;
	private double euro;
	private double ouro;
	
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
	
	
	public static double selecionarCambio(String cambio, String tipo, double real) {

		double valor = 0.0;
		if(cambio == "DC") {
			if(tipo =="venda") {
			  valor = 5.6066;
			}else
			if(tipo=="compra")
			{
				valor = 5.6061;
			}
		}else
		if(cambio == "DP"){
			if(tipo =="venda") {
				  valor = 5.79;
			}else
			if(tipo=="compra")
			{
				valor = 5.69;
			}
			
		}else
		if(cambio == "DX") {
			if(tipo =="venda") {
				  valor = 5.6064;
			}else
			if(tipo=="compra")
			{
				  valor = 5.6058;
			}
		}else
		if(cambio == "DT") {
			if(tipo =="venda") {
				  valor = 5.7530;
			 }else
			if(tipo=="compra")
			{
					valor = 5.5430;
			}
		}else 
		if(cambio =="EU") {
			if(tipo =="venda") {
				  valor = 6.8070;
			}else
			if(tipo=="compra")
			{
					valor = 6.5630;
			}
		}else
		if(cambio == "OU") {
			if(tipo =="venda") {
				 valor = real * 0.0188;
			}else
			if(tipo=="compra")
			{
				valor = 346.70;
			}
		}
		
		
		return valor;
	}
	
	public static Double converterMoeda(double real, String cambio, String tipo) {
		double valorCambio = selecionarCambio(cambio, tipo, real);
		Double valor = null;
		
			if(tipo =="venda") {
				valor = real*valorCambio;
			}
			if(tipo == "compra") {
				valor = real/valorCambio;
			}
		
		
		return valor;
		
	}

}
