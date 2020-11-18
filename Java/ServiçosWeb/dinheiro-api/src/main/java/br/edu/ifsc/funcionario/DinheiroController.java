package br.edu.ifsc.funcionario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinheiroController {
@RequestMapping(value="/converter_moeda/{quantia}/{tipoMoeda}/{tipoOperacao}")
	public Double converterMoeda(
			@PathVariable("quantia") double quantia,
			@PathVariable("tipoMoeda") String tipoMoeda, 
			@PathVariable("tipoOperacao") String tipoOperacao) {
				
			return Dinheiro.converterMoeda( quantia, tipoMoeda, tipoOperacao);
		
	}
@RequestMapping(value="/apresentar_dados/{quantia}/{tipoOperacao}")
	public  DinheiroDTO apresentarDados(@PathVariable("quantia") double quantia, @PathVariable("tipoOperacao") String tipoOperacao) {
		
		double dolarComercial = Dinheiro.converterMoeda(quantia,"DC", tipoOperacao);
		double dolarParalelo = Dinheiro.converterMoeda(quantia, "DP", tipoOperacao);
		double dolarPTAX = Dinheiro.converterMoeda( quantia,"DX", tipoOperacao );
		double dolarTurismo = Dinheiro.converterMoeda(quantia, "DT", tipoOperacao);
		double euro = Dinheiro.converterMoeda( quantia,"EU", tipoOperacao);
		double ouro = Dinheiro.converterMoeda(quantia,"OU", tipoOperacao);
		
		return new DinheiroDTO( quantia, tipoOperacao,  dolarComercial,  dolarParalelo,  dolarPTAX,
				 dolarTurismo, euro, ouro);
	}


}
