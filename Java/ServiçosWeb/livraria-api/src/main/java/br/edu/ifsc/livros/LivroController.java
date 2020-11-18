package br.edu.ifsc.livros;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
//1° ii) MÉTODO P/ADICIONAR LIVRO A LISTA.
	@RequestMapping(value = "/Adicionar_livro/{id}/{isbn}/{titulo}/{autor}/{editora}/{preco}")
	//aqui tem que fazer um metodo POST e fazer um teste no postman como o professor pediu
	public Livro adicionarLivro(
			@PathVariable(name = "id")int id, 
			@PathVariable(name = "isbn")int isbn, 
			@PathVariable(name = "titulo")String titulo, 
			@PathVariable(name = "autor")String autor, 
			@PathVariable(name = "editora")String editora, 
			@PathVariable(name = "preco")double preco) {
		 Livro livro = new Livro(id, isbn, titulo, autor, editora, preco);
		 LivroDataSource.add(livro);
		 return livro;
	}
	
//2° iii) MÉTODO P/ RETORNA A LISTA DE LIVROS.
	@RequestMapping(value = "/Livros")
	public List<Livro> getLivros(){
		return LivroDataSource.getAll();
	}
//3° iv) MÉTODO P/ RETORNAR TODOS OS DADOS DO LIVRO PELO GET ISBN.
	@RequestMapping(value = "/Localizar_por_isbn/{isbn}")
	public Livro getPorIsbn(
			@PathVariable("isbn")int isbn) {
		return LivroDataSource.getPorIsbn(isbn);
	}
//4° v) MÉTODO P/ RETORNAR LISTA DE LIVROS DADO O NOME DO AUTOR.
	@RequestMapping(value = "/psq_autor/{autor}")
	public List<Livro> getPorAutor(
			@PathVariable("autor")String autor) {
		return LivroDataSource.getPorAutor(autor);
	}
//5° vi) MÉTODO P/ RETORNAR UM LIVRO CONFORME SEU TÍTULO.
	@RequestMapping(value = "/psq_titulo/{titulo}")
	public Livro getPorTitulo(
			@PathVariable("titulo")String titulo) {
		return LivroDataSource.getPorTitulo(titulo);
	}
//6° vii) MÉTODO P/ RETORNAR OBJETO DTO(TITULO, AUTOR, EDITORA E PREÇO), POR GET ISBN DTO.
	@RequestMapping(value = "/psq_isbn_dto/{isbn}")
	public LivroDTO getPorIsbnDTO(
			@PathVariable("isbn")int isbn) {
		/*Livro livro = LivroDataSource.getPorIsbn(isbn);
		return livro.getLivroDTO();*/
		
		return LivroDataSource.getPorIsbnDTO(isbn);
		
	}
//7° viii) MÉTODO P/ RETORNAR OS  ATRIBUTOS(TITULO, AUTOR, EDITORA, PREÇO) DE TODOS OS LIVROS.
	@RequestMapping(value = "/livrosDTO")
	public List<LivroDTO> getList(){
		List<LivroDTO> resultado = new ArrayList<>();
		for(Livro livro : LivroDataSource.getAll()) {
			LivroDTO livroDTO = new LivroDTO(livro.getTitulo(), livro.getAutor(),
					livro.getEditora(), livro.getPreco());
			resultado.add(livroDTO);
		}
		return resultado;
	}
//8° ix) MÉTODO P/ REAJUSTAR O PREÇO DE UM  LIVRO DA LISTA, POR ID, SENDO O  REAJUSTE RECEBIDO DO PARAMETRO.
	//OBS: VOID Ñ RETORNA, ATUALIZA
	@RequestMapping(value = "/Reajustar_preco_id/{id}/{taxa}")
	public void getReajustarPrecoPorId(
			@PathVariable("id")int id, 
			@PathVariable("taxa")int taxa) {
		LivroDataSource.reajustarPrecoPorId(id,taxa);
	}
}
