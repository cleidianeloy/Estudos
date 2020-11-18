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
class Curso
{
	public $nome;
	public $duracao;
	//criando os métodos da classe 

function mostrarNome()
{
	return $this -> nome;
}

function classificarCurso()
{
	//classificar o cursso de acordo com o atributo $duracao deste curso
	if($this -> duracao <= 1)
	{
		$classif = "curso de curta duração";
	}elseif($this -> duracao < 3)
	{
		$classif = "curso de média duração";
	}
	else
	{
		$classif = "Curso de longa duração";
	}

	return $classif;
}

}
//criar  objeto por meio do uso da classe
$curso1 = new Curso();

$curso2 = new Curso();
//atribuindo valores aos atributos dos objetos

$curso1 -> nome = "Curso Técnico de Desenvolvimento de Sistemas";
$curso1 -> duracao = 3;

$curso2 -> nome = "Curso Superior de Tecnologia em Gestão da Tecnologia da informação";
$curso2 -> duracao = 6;
//iinvocando os métodos que mostram o nome e a classificação de cada curso
$nomeCurso1 = $curso1 -> mostrarNome();
$nomeCurso2 = $curso2 -> mostrarNome();
$classifCurso1 = $curso1 -> classificarCurso();
$classifCurso2 = $curso2 -> classificarCurso();

echo "<p> Dados de cada curso : <br>
	  Nome do curso1 = $nomeCurso1 <br>
	  Nome do curso2 = $nomeCurso2 <br>
	  Classificação do curso1 = $classifCurso1 <br>
	  Classificação do curso2 = $classifCurso2 </p> ";
?>


</body>
</html>