package br.edu.ifsc.funcionario;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FuncionarioController {
	
	@RequestMapping(value="/novo_funcionario/{matricula}/{nome}/{salarioBase}/{numeroDependentes}")
	public Funcionario NovoFuncionario( //Novo funcionario
			@PathVariable("matricula") int matricula, 
			@PathVariable("nome") String nome, 
			@PathVariable("salarioBase") double salarioBase, 
			@PathVariable("numeroDependentes") int numeroDependentes) {
		
		Funcionario funcionario = new Funcionario(matricula, nome, salarioBase, numeroDependentes);
		
		FuncionarioDataSource.novo(funcionario);
		
		return funcionario;
		
	}
	@RequestMapping(value="/funcionarios")
	public List<Funcionario> getFuncionario() //Listar todos os funcionarios
	{
		return FuncionarioDataSource.getListaFuncionario();
	}
	
	@RequestMapping(value="/funcionario/{mtr}")
	public String funcionario( //Pesquisar funcionario por matrícula
	@PathVariable("mtr") int matricula) {
		
		
		String nome = null;
		
		for (int i = 0; i < FuncionarioDataSource.size(); i++) {
			
		  	Funcionario auxiliar = FuncionarioDataSource.getListaFuncionario().get(i);
			 
			int escolha = auxiliar.getMatricula();
			if( escolha == matricula)
			{
				nome = auxiliar.getNome();
				break;
			}
		
		}	
		
		
		return nome;
		
	}
		@RequestMapping(value="calcular_salario/{matr}")
		
		public Double calcularSalario(//Calcular salario liquido de um funcionario dada a sua matrícula
				@PathVariable("matr") int matricula) {
			
			
			Double salarioLiquido = null;
			for (int i = 0; i < FuncionarioDataSource.size(); i++) {
				
			    Funcionario auxiliar = FuncionarioDataSource.getListaFuncionario().get(i);
				 
				int escolha = auxiliar.getMatricula();
				if( escolha == matricula)
				{
					salarioLiquido = auxiliar.calcularSalarioLiquido();
					break;
				}
			
			}
			
			return salarioLiquido;
			
		}
	
	

}
