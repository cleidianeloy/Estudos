package br.edu.ifsc.funcionario;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinheiroController {
	@RequestMapping(value="/converter_moeda/{valor}/{tipoMoeda}/{tipoOperacao}")
	public double cotacao(@PathVariable("valor") double valor,@PathVariable("tipoMoeda") String tipoMoeda,@PathVariable("tipoOperacao") String tipoOperacao ) {
		 
		return DinheiroDataSource.retornaCotacao( valor, tipoMoeda, tipoOperacao);
		
		
	}
	@RequestMapping(value="/mostra_valores")
	public List<Dinheiro> cotacao() {
		 
		return DinheiroDataSource.RetornaValores();
		
		
	}
	@RequestMapping(value="/cotacao_moedas/{quantia}/{tipoOperacao}")
	public  DinheiroDTO apresentarDados(@PathVariable("quantia") double quantia, @PathVariable("tipoOperacao") String tipoOperacao) {
		
		double dolarComercial = DinheiroDataSource.retornaCotacao(quantia,"DC", tipoOperacao);
		double dolarParalelo = DinheiroDataSource.retornaCotacao(quantia, "DP", tipoOperacao);
		double dolarPTAX = DinheiroDataSource.retornaCotacao( quantia,"DX", tipoOperacao );
		double dolarTurismo = DinheiroDataSource.retornaCotacao(quantia, "DT", tipoOperacao);
		double euro = DinheiroDataSource.retornaCotacao( quantia,"EU", tipoOperacao);
		double ouro = DinheiroDataSource.retornaCotacao(quantia,"OU", tipoOperacao);
		
		return new DinheiroDTO( quantia, tipoOperacao,  dolarComercial,  dolarParalelo,  dolarPTAX,
				 dolarTurismo, euro, ouro);
	}
}

