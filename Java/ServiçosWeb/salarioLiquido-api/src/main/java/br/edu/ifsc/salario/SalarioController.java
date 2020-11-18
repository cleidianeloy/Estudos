package br.edu.ifsc.salario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalarioController {
	@RequestMapping(value="/retorna_salario/{salarioBruto}")
	public double mostraSalario(@PathVariable("salarioBruto") double salarioBruto) {
			
		return Salario.calcularSalario(salarioBruto);
		
	}
	
	@RequestMapping(value="/retorna_dados/{salarioBruto}")
	public SalarioDTO mostrarDados(@PathVariable double salarioBruto) {
		
		double salarioLiquido = Salario.calcularSalario(salarioBruto);
		double irpf = Salario.calcularIRPF(salarioBruto);
		double inss = Salario.calcularINSS(salarioBruto);
		
		 return new SalarioDTO(salarioBruto, irpf, inss, salarioLiquido);
	}
}

