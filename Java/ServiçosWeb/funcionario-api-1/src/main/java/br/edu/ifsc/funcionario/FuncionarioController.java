package br.edu.ifsc.funcionario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//MÉTODO P/ RETORNAR O CALCULO DO SALÁRIO LÍQUIDO COM OS DESCONTOS.
@RestController
public class FuncionarioController {
	@RequestMapping(value = "/salario_liquido/{salarioBruto}", method = RequestMethod.GET)
	public double calcularSalarioLiquido(
			@PathVariable("salarioBruto") double salarioBruto) {
		return Funcionario.calcularSalarioLiquido(salarioBruto);
	}
	
	@RequestMapping(value= "/mostrar_dados/{salarioBruto}", method = RequestMethod.GET)
	
	

	public Funcionario mostrarDados(
			@PathVariable("salarioBruto") double salarioBruto){
		
		double irpf = Funcionario.calcularDescontoIrpf(salarioBruto);
		double inss = Funcionario.calcularDescontoInss(salarioBruto);
		
		Funcionario funcionario = new Funcionario(salarioBruto,irpf,inss);
		
		FuncionarioDataSource.adicionar(funcionario);
		
		return FuncionarioDataSource.getFuncionarioAtual();
		
	}

}
