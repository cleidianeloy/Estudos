package br.edu.ifsc.funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class DinheiroDataSource {
	private static List<Dinheiro> listaCotacao = new ArrayList<>();
	
	public static void criarLista() {
		listaCotacao.add(new Dinheiro("DC",5.6061, 5.6066));
		listaCotacao.add(new Dinheiro("DP", 5.69, 5.79));
		listaCotacao.add(new Dinheiro("DX",5.6058 , 5.6064));
		listaCotacao.add(new Dinheiro("DT", 5.5430, 5.7530));
		listaCotacao.add(new Dinheiro("EU",6.5630, 6.8070));
		listaCotacao.add(new Dinheiro("OU",346.70, 1.88));
	}
	public static List<Dinheiro> RetornaValores() {

			return listaCotacao;
		
	}

	public static  Dinheiro retornaMoeda(String moeda){
		
		for (Dinheiro dinheiro: listaCotacao) {
			if (dinheiro.getMoeda().equalsIgnoreCase(moeda)) {
			    return dinheiro;
			}
		}
		return null;
		
	}
	public static double calcularPrecoVendaOuro(Dinheiro dinheiro) {
		double precoVendaOuro = dinheiro.getCompra() + 
				(dinheiro.getCompra() * dinheiro.getVenda() / 100);
		return precoVendaOuro;
	}
	public static Double retornaCotacao(double valor,String tipoMoeda,String tipoOperacao ) {
		Dinheiro dinheiro = retornaMoeda(tipoMoeda);
		
		Double cotacao = null;
		if(dinheiro != null) {
			if (tipoOperacao.equalsIgnoreCase("venda")) {
				if (!tipoMoeda.equalsIgnoreCase("OU")) {
					cotacao = valor / dinheiro.getVenda();
				} else {
					cotacao = valor / calcularPrecoVendaOuro(dinheiro);
				}
			}else {
				cotacao = valor * dinheiro.getCompra();
			}
		}
		
		BigDecimal d = new BigDecimal(cotacao).setScale(2, RoundingMode.HALF_EVEN); //formata o numero 
		return d.doubleValue();
	}
	
}
