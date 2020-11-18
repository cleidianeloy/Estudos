<!DOCTYPE html>
<html>
<head>
	<title>exercicio 2</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<h1>funções e includes em PHP -exercicio 2</h1>
<fieldset>
	<form method="post" action="exerc2.php">
	<legend>processando números com funções e includes em PHP</legend>
	<label class="alinha">Forneça o primeiro valor inteiro </label>
	<input type="number" name="valor1" autofocus><br>
	<label>forneça o segundo valor inteiro:</label>
	<input type="number" name="valor2"><br>
	<button type="submit" name="enviar">Executar operações matemáticas com os valores fornecidos</button>
</fieldset> 
<?php
include "exerc2.inc.php";
//include_once "exerc2.inc.php";
//require "exerc2.inc.php"; //é pra ele continuar o resto do codigo mesmo que dê erro no include 
if (isset($_POST['enviar']))
{
	//receber os dois valores númericos 
	$valor1 = $_POST["valor1"];
	$valor2 = $_POST["valor2"];
	//invocar a função que recebe os dois números e DEVOLVE a sua soma 

	$soma = adicionarNumeros($valor1, $valor2);
	//invocar a função que recebe a soma e devolve o cubo desta soma 
	$cubo = calcularCubo($soma);
	//invocar a função que recebe os dois numeros, a soma e o cubo e MOSTRA estes dados na pagina web 
	mostrarResultados($valor1,$valor2,$soma,$cubo);
}

?>
</form>
</body>
</html>