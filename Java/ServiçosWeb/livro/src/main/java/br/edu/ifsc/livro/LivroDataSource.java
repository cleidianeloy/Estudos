package br.edu.ifsc.livro;

import java.util.ArrayList;
import java.util.List;



public class LivroDataSource {
	private static List<Livro> listaLivros = new ArrayList<>(); //metodo pra criar uma lista da classe livro
	
	public static void criarLista() {//→ para iniciar a lista com alguns livros 
		listaLivros.add(new Livro(1, 10, "Primeiro Livro", "Desconhecido", "Desconhecida", 100.00));
		listaLivros.add(new Livro(2, 20, "Segundo Livro", "Desconhecido", "Desconhecida", 10.00));
		listaLivros.add(new Livro(3, 30, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Rocco", 30.00));
		listaLivros.add(new Livro(4, 40, "Harry Potter e a Câmara Secreta", "J.K. Rowling", "Rocco", 20.00));
		listaLivros.add(new Livro(5, 50, "Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", "Rocco", 40.00));
		listaLivros.add(new Livro(6, 60, "Harry Potter e a Ordem da Fênix", "J.K. Rowling", "Rocco", 40.00));
		listaLivros.add(new Livro(7, 70, "Harry Potter e o Enigma do Príncipe", "J.K. Rowling", "Rocco", 50.00));
		listaLivros.add(new Livro(8, 80, "Harry Potter e as Relíquias da Morte", "J.K. Rowling", "Rocco", 80.00));
		
	}
	
	public static void adicionar(Livro livro){ //→ para adicionar um novo livro na lista 
		listaLivros.add(livro);
	}
	
	public static List<Livro> getAll(){ //→ para retornar todos os livros da lista, cada qual com todo os seus dados (atributos)
		
		return listaLivros;
	}
	
	public static Livro getPorIsbn(int isbn){//→ para retornar todos os dados de um livro conforme o seu código ISBN.
		
		int i=0;
		Livro auxiliar = null;
		
		for(Livro livro : listaLivros) {//laço de repetição
			
			if(livro.getIsbn() == isbn) {
				
				auxiliar = getAll().get(i);
				
			}
			i++;
		}
		return auxiliar;
	}
	
	public static List<Livro> getPorAutor(String autor) { //→ para retornar uma lista de livros dado o nome do autor
		List<Livro> listaAutores = new ArrayList<>();
		
		for(Livro livro : listaLivros) {
			if (livro.getAutor().equalsIgnoreCase(autor)){
				listaAutores.add(livro);
			}
		}
		
		return listaAutores;
		
	}
	public static Livro getPorTitulo(String titulo) {// → para retornar um livro conforme o seu título
		Livro auxiliar = null;
		for(Livro livro: listaLivros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				auxiliar = livro;
			}
		}
		
		return auxiliar;
	}
	public static LivroDTO getPorIsbnDTO(int isbn) { //retorna um objeto DTO contendo título, autor, editora e preço.
		LivroDTO auxiliar = null;
		
		for(Livro livro : listaLivros) {//laço de repetição
			
			if(livro.getIsbn() == isbn) {
				
				auxiliar = new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco()); 
				
			}

		}
		return auxiliar;
	}
	
	public static List<LivroDTO> getAllDTO(){ // → retorna os atributos título, autor, editora e preço de todos os livros.
		List<LivroDTO> listaDTO = new ArrayList<>();
		LivroDTO auxiliar = null;
		for(Livro livro : listaLivros) {
			auxiliar = new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco()); 
			listaDTO.add(auxiliar);
		}
		
		return listaDTO;
	}
	public static void reajustarPrecoPorId(int id, int taxa) {/*→método para reajustar o preço de um livro da lista 
		conforme o seu id. O reajuste será feito de acordo com a taxa recebida no parâmetro*/
		for(Livro livro : listaLivros){
			if(livro.getId() == id) {
				
				livro.reajustarPreco(taxa);
			}
		}
	}
	public static void reajustarPreco(int taxa) {/*→ reajusta o preço de todos os livros conforme a taxa informada
		por parâmetro*/
		for(Livro livro : listaLivros) {
			
		 livro.reajustarPreco(taxa); 
		}
			
	}
	
}
