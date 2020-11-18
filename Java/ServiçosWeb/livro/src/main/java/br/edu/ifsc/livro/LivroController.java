package br.edu.ifsc.livro;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
// para adicionar um novo livro na lista
	@RequestMapping(value="/novo_livro", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void adicionar( @RequestBody Livro livro) {
		LivroDataSource.adicionar(livro);
	}
	
// para retornar todos os livros da lista, cada qual com todo os seus dados(atributos)
	@RequestMapping(value="/retorna_livros",method = RequestMethod.GET)
	public List<Livro> RetornaLivros(){
		return LivroDataSource.getAll();
	}
//para retornar todos os dados de um livro conforme o seu código ISBN.
	@RequestMapping(value="/todosISBN/{isbn}",method = RequestMethod.GET)
	public Livro getPorIsbn(@PathVariable("isbn") int isbn)
	{
		return LivroDataSource.getPorIsbn(isbn);
	}
//para retornar uma lista de livros dado o nome do autor
	@RequestMapping(value="/lista_autores/{autor}",method = RequestMethod.GET)
	public List<Livro> getPorAutor(@PathVariable("autor") String autor){
		return LivroDataSource.getPorAutor(autor);
		
	}
	// para retornar um livro conforme o seu título
	@RequestMapping(value="/titulo/{titulo}",method = RequestMethod.GET)
	public Livro Titulo(@PathVariable("titulo") String titulo) {
		return LivroDataSource.getPorTitulo(titulo);
	}
// retorna um objeto DTO contendo título, autor, editora e preço.
	@RequestMapping(value="/livroDTO/{isbn}",method = RequestMethod.GET)
	public LivroDTO DTOeISBN(@PathVariable("isbn") int isbn) {
		return LivroDataSource.getPorIsbnDTO(isbn);
	}
//  retorna os atributos título, autor, editora e preço de todos os livros.
	@RequestMapping(value="/tudoDTO",method = RequestMethod.GET)
	public List<LivroDTO> tudoDTO() {
		return LivroDataSource.getAllDTO();
	}
//  método para reajustar o preço de um livro da lista conforme o seu id
	@RequestMapping(value="/restauraID/{id}/{taxa}",method = RequestMethod.GET)
	public void RestauraPrecoId(
			@PathVariable("id") int id,
			@PathVariable("taxa") int taxa) {
		LivroDataSource.reajustarPrecoPorId(id, taxa);
	}
	// reajustarPreco  → reajusta o preço de todos os livros conforme a taxa informada por parâmetro.
	@RequestMapping(value="/restauraTudo/{taxa}",method = RequestMethod.GET)
	public void reajustarPreco(@PathVariable("taxa") int taxa) {
		LivroDataSource.reajustarPreco(taxa);
	}



}
