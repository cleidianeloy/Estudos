package br.edu.ifsc.livros;

public class LivroDTO {
	private  String titulo;
	private String autor;
	private String editora;
	private double preco;
// 1° MÉTODO CONSTRUTOR.
	public LivroDTO(String titulo, String autor, String editora, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}
// 2° CONTRUTOR VAZIO.
	public LivroDTO() {
	super();
}
// 3° MÉTODOS DE ACESSO.
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

}
