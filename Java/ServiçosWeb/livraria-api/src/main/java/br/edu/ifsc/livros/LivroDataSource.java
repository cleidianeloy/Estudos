package br.edu.ifsc.livros;
//1° SERVE P/ MANTER OS DADOS REGISTRADOS.

import java.util.ArrayList;
import java.util.List;

public class LivroDataSource {
//2° CRIAÇÃO DA LISTA. STATIC P/ ACESSAR DE FORMA GLOBALIZADA P/ CONTEXTO APLICAÇÃO.
	private static List<Livro> listaLivros = new ArrayList<>();
//3° i)MÉTODO P/ CRIAR A LISTA C/ VALORES CONHECIDOS.	
	public static void criarLista() {
	listaLivros.add(new Livro(1, 11, "O Cortiço", "Castro Alves", "Todo Livro", 20.0));
	listaLivros.add(new Livro(2, 12, "Dom Casmurro", "Machado de Assis", "Livraria Garnier", 16.0));
	listaLivros.add(new Livro(3, 13, "O Guarani", "José de Alencar", "Principis", 10.0));
	listaLivros.add(new Livro(4, 14, "Espumas Flutuantes", "Castro Alves", "Ateliê Editorial", 15.0));
	}
//4° MÉTODO DE ACESSO A LISTA.
public static List<Livro> getListaLivros() {
		return listaLivros;
	}

	/*public static void setListaLivros(List<Livro> listaLivros) {
		LivroDataSource.listaLivros = listaLivros;
	}*/

//5° ii) MÉTODOS P/ ADD LIVRO  A LISTA.
	public static void add(Livro livro) {
		listaLivros.add(livro);
	}
//6° iii) MÉTODO P/ RETORNAR TODOS OS LIVROS DA LISTA.
	public static List<Livro> getAll(){
		return listaLivros;
	}
//7° iv) MÉTODO P/ RETORNAR TODOS OS DADOS DO LIVRO PELO GET ISBN.
	public static Livro getPorIsbn(int isbn) {
		for(Livro livro : listaLivros) {
			if(livro.getIsbn() == isbn) return livro;
		}
// OBS: NECESSARIO,POIS PODE Ñ EXISTIR O ISBN NA LISTA, OU O OBJETO.
		return null;
	}
//8° v) MÉTODO P/ RETORNAR LISTA DE LIVROS DADO O NOME DO AUTOR.
	public static List<Livro> getPorAutor(String autor) {
		List<Livro> listaAutores = new ArrayList<>();
		
		for(Livro livro : listaLivros) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				listaAutores.add(livro);
			}
		}
		return listaAutores;
	}
//9° vi) MÉTODO P/ RETORNAR UM LIVRO CONFORME SEU TÍTULO.
	public static Livro getPorTitulo(String titulo) {
		for (Livro livro : listaLivros){
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}
//10° vii) MÉTODO P/ RETORNAR OBJETO DTO(TITULO, AUTOR, EDITORA E PREÇO), POR GET ISBN DTO.
	public static LivroDTO getPorIsbnDTO(int isbn) {
		LivroDTO livroDTO = null;
		for(Livro livro : listaLivros) {
			if(livro.getIsbn() == isbn) {
				livroDTO = new LivroDTO(livro.getTitulo(),livro.getAutor(), livro.getEditora(),livro.getPreco());
				return livroDTO;
			}
		}	
		return null;
	}
//11° ix) MÉTODO P/ REJUSTAR UM PREÇO DADO ATRAVEZ DO SEU ID.
	public static void reajustarPrecoPorId(int id,double taxa) {
		for(Livro livro : listaLivros) {
			if(livro.getId() == id) {
				livro.reajustarPreco(taxa);
			}
		}
	}
	 
	public static void reajustarPreco(double taxa) {
		for(Livro livro : listaLivros) {
			livro.reajustarPreco(taxa);
		}
	}

	
}
