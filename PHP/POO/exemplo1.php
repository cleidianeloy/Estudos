<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> POO com PHP</title>
</head>
<body>
	<h1>Fundamentos da POO com a linguagem PHP</h1>

<?php
//Ex: simplificado atv1, mostrando  CRIAÇÃO de uma CLASSE em PHP
class Produto 
{
//CRIAÇÃO dos ATRIBUTOS da CLASSE.
	public $nome;
	public $preco;
	public $categoria;
//CRIAR METODOS das CLASSE.
	function mostrarCategoria()
	{
		return $this->categoria; #$this->coringa do PHP, mostra corretamente a categoria do objeto. ex. $nome.
	}
}
//CRIAR OBJETO PRODUTO por meio do uso  da CLASSE.
$produto1 = new Produto();
$produto2 = new Produto();
//Atribuir valores aos ATRIBUTOS dos OBJETOS.
$produto1->nome = "Impressora";
$produto1->preco = 550.12;
$produto1->categoria = "Suprimentos de impressão";

$produto2->nome = "Placa de video";
$produto2->preco = 2550.12;
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