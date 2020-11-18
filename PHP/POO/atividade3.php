<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> POO com PHP</title>
</head>
<body>
	<h1>Fundamentos da POO com a linguagem PHP</h1>

<?php 
//Ex: simplificado atividade 3, mostrando  CRIAÇÃO de uma CLASSE em PHP
class ContaBancaria
{
	public $saldoAtual;
	//criando os métodos da classe 

function depositar($valor)
{
	 $this -> saldoAtual =  $this -> saldoAtual + $valor;
}

function sacar($valor)
{
	 $this -> saldoAtual =  $this -> saldoAtual + $valor;
}
function mostrarSaldoAtual()
{
	return $this -> saldoAtual;
}

}
//criar  objeto por meio do uso da classe
$conta1 = new ContaBancaria();

$conta2 = new ContaBancaria();
//atribuindo valores aos atributos dos objetos

$conta1 -> saldoAtual = 1000 ;

$conta1 -> depositar(2000);

$conta1 -> sacar(500);

$saldoAtualizado = $conta1 -> mostrarSaldoAtual();

echo "<p>Após a definição do saldo inicial, do depósito e do saque, o valor do saldo atual do nosso correntista é igual a R$ $saldoAtualizado</p> ";
?>


</body>
</html>