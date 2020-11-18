<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> POO com PHP</title>
</head>
<body>
	<h1>Fundamentos da POO com a linguagem PHP</h1>

<?php
//Ex: simplificado atv1, mostrando  CRIAÇÃO de uma CLASSE em PHP e o uso de um método construtor 
class Produto 
{
//CRIAÇÃO dos ATRIBUTOS da CLASSE.
	public $nome;
	public $preco;
	public $categoria;

	//criando um método contrutor personalidado
	function __construct($nomeDoProduto,$precoDoProduto,$categoriaDoProduto)
	{
			$this->nome = $nomeDoProduto;
			$this->preco = $precoDoProduto;
			$this->categoria = $categoriaDoProduto;
	}

//CRIAR METODOS das CLASSE.
	function mostrarCategoria()
	{
		return $this->categoria; #$this->coringa do PHP, mostra corretamente a categoria do objeto. ex. $nome.
	}
}
//CRIAR OBJETO PRODUTO por meio do uso  da CLASSE.
$produto1 = new Produto("placa de rede", 250.21, "Periférico de rede ");
echo "<p> Atributos 1 do objeto produtos antes de iniciarmos seus valores :
<br>
Nome = $produto1->nome <br>
Preço = $produto1->preco </p> ";
$produto2 = new Produto("placa de video", 900, "Hadware de video");
//Atribuir valores aos ATRIBUTOS dos OBJETOS.
echo "<p> Atributos 2 do objeto produtos antes de iniciarmos seus valores :
<br>
Nome = $produto2->nome <br>
Preço = $produto2->preco </p> ";

$produto1->nome = "Impressora";
$produto1->preco = 550.12;
$produto1->categoria = "Suprimentos de impressão";

$produto2->nome = "Placa de video";
$produto2->preco = 250.12;
$produto2->categoria = "Hardware computacional";
//Finalizando, vamos fazer o PHP acessar o método de cada objeto para mostrar a catregoria de cada um deles.
$categ1 = $produto1->mostrarCategoria();
$categ2 = $produto2->mostrarCategoria();
 echo "<p>Categorias dos dois objetos: <br>
          Produto1: $categ1 <br>
          Produto2: $categ2 </p>";



?>
</body>
</html>