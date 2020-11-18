package br.edu.ifsc.moeda;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CotacaoMoedaController {

	@RequestMapping(value = "/converter_moeda/{valor}/{tipoMoeda}/{tipoOperacao}", method = RequestMethod.GET)
	public Double converterMoeda(
			@PathVariable(name = "valor") double valor, 
			@PathVariable(name = "tipoMoeda") String tipoMoeda, 
			@PathVariable(name = "tipoOperacao") String tipoOperacao) {
		
		return MoedaDataSource.converterMoeda( valor, tipoMoeda, tipoOperacao);
	}

	@RequestMapping(value = "/valor_todos/{valor}/{tipoOperacao}", method = RequestMethod.GET)
	public MoedaDTO ValorTodos(
			@PathVariable(name = "valor") double valor, 
			@PathVariable(name = "tipoOperacao") String tipoOperacao) 	{
	
		double DC = MoedaDataSource.converterMoeda( valor, "DC", tipoOperacao);
		double DP = MoedaDataSource.converterMoeda( valor, "DP", tipoOperacao);
		double DX = MoedaDataSource.converterMoeda( valor, "DX", tipoOperacao);
		double DT = MoedaDataSource.converterMoeda( valor, "DT", tipoOperacao);
		double EU = MoedaDataSource.converterMoeda( valor, "EU", tipoOperacao);
		double OU = MoedaDataSource.converterMoeda( valor, "OU", tipoOperacao);
		
		return new MoedaDTO(valor, tipoOperacao, DC, DP, DX, DT, EU, OU);
		
	}
	@RequestMapping(value = "/tipos", method = RequestMethod.GET)
	
	public List<OutraDTO> tipos(){
		
		return MoedaDataSource.tipos();
	}
	
	
}