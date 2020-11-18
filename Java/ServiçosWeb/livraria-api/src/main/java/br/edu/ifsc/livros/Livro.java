package br.edu.ifsc.livros;
//1°ATRIBUTOS DA CLASSE.
public class Livro {
	private int id;
	private int isbn;
	private String titulo;
	private String autor;
	private String editora;
	private double preco;
//2°MÉTODO CONSTRUTOR.
	public Livro(int id, int isbn, String titulo, String autor, String editora, double preco) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}
//3°METODO CONTRUTOR VAZIO, P/CONSTRUIR OBJETOS S/ INFORMAR VALORER DE ATRIBUTOS.
public Livro() {
	super();
}
//4°MÉTODOS DE ACESSO.
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
//1° vii) MÉTODO P/ RETORNAR OBJETO DTO(TITULO, AUTOR, EDITORA E PREÇO), POR GET ISBN DTO.
	/*public LivroDTO getLivroDTO() {
		LivroDTO livroDTO = new LivroDTO(this.getAutor(), this.getEditora(), this.getTitulo(), this.getPreco());
		return livroDTO;
		
		//isso não é necessario
	}*/
	//2° ix) MÉTODO P/ REAJUSTAR O PREÇO DE UM  LIVRO DA LISTA.
	//OBS: VOID Ñ RETORNA, ATUALIZA
	   public void reajustarPreco(double taxa) {
	       this.preco = preco + (preco*(taxa/100));
	       
	    } 
}
