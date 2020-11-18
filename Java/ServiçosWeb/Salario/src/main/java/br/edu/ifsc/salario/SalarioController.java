package br.edu.ifsc.salario;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SalarioController {

	@RequestMapping(value="/calcular_salario/{nome}/{salarioBase}/{dependentes}", method=RequestMethod.GET)
	
	
	
	public Double calcularSalario(
			@PathVariable("nome") String nome,
			@PathVariable("salarioBase") Double salarioBase,
			@PathVariable("dependentes") int dependentes	
		) {
		Double irpf = 0.0;
		if(salarioBase>=8500)
		{
			 irpf = 0.275;
		}else
		if((salarioBase>= 5000) && (salarioBase<8500)) 
		{
			irpf = 0.15;
		}else
		if(salarioBase<5000)
		{
			irpf= 0.0;
		}
		
		dependentes = dependentes * 150;
		
		return  salarioBase-(salarioBase*irpf)+dependentes;
		
		
		
		
	}
	
	
	



}
