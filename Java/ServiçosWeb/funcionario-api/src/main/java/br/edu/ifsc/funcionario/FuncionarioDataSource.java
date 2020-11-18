package br.edu.ifsc.funcionario;

import java.util.ArrayList;
import java.util.List;





public class FuncionarioDataSource {
	private static List<Funcionario> listaFuncionario = new ArrayList<>();
	public static void criarLista() {
		listaFuncionario.add(new Funcionario(1,"Cleidiane",1000.0,4));
	}
	public static List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}
	
	public static void  novo(Funcionario funcionario) {
		listaFuncionario.add(funcionario);
	}
	public static int size()
	{
		int size = listaFuncionario.size();
		
		return size;
	}
}
