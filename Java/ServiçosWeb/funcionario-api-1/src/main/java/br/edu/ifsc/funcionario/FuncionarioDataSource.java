package br.edu.ifsc.funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
//MÉTODO P/ CRIAR LISTA DE FUNCIONARIOS.
	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(4000.0, 263.87, 560.0 ));
	}
	public static List<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
//MÉTODO P/ ADICIONAR OBJETO A LISTA.
	public static void adicionar(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
//METODO PARA SABER O TAMANHO DA LISTA
	public static int size()
	{
		int size = listaFuncionarios.size();
		
		return size;
	}
//METODO PARA PEGAR O ULTIMO ELEMENTO	
	public static Funcionario getFuncionarioAtual(){
		
		Funcionario funcionario = getListaFuncionarios().get(0);
		int tamanho = size();
		
		for(int i = 0; i < tamanho; i++)
		{ 
			if(i == tamanho-1)
			{
				 funcionario =  getListaFuncionarios().get(i);
			}
			
		}
		
		return funcionario;
	}
	
}
