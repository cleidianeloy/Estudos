<!DOCTYPE html>
<html>
<head>
	<title>exercicio 6</title>
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
</head>
<body>
<h1>exercicio 6</h1>
<?php
		$cliente["1010-X1"] = ["Joana de Almeida", 6800.00];
		$cliente["1010-X2"] = ["Genésio de Ataíde", 15300.00];
		$cliente["1010-X3"] = ["Maria das Graças",4100.12];
		$cliente["1010-X4"] = ["Caroline Prado", 2300.76];
?>
<form method="post" action="exerc6.php">
	<fieldset>
		<label>Forneça a sua conta</label>
		<input type="text" name="caixa"><br><br>
		<label>Forneça o valor em reais</label>
		<input type="number" name="reais" min="0" step='0.01'><br><br>
		<label>Informe se será um deposito ou um saque na conta bancária: </label><br>
		<input type="radio" name="tipo" value='deposito' checked=""> Depósito <br>
		<input type="radio" name="tipo" value='saque'> Saque <br><br>
		<label>Selecione uma opção:</label>
		<select name='operacao'>
			<option value="1">Receber os dados do cliente</option>
			<option value="2">dados dos cliente com o maior saldo</option>
			<option value='3'>adicionar, manualmente alguns clientes à matriz</option>
		</select>
	</fieldset>
	<button type="submit" name="enviar">Pronto</button>
</form>
<?php

if(isset($_POST["enviar"]))
{ 
	$operacao =$_POST["operacao"];

	

	if($operacao=='1')
	{
		$caixa=$_POST["caixa"];
		$reais=$_POST["reais"];
		$operacao=$_POST["operacao"];
		$tipo=$_POST["tipo"];

		$existe = array_key_exists($caixa, $cliente);
	
		if($existe == true)
			
		{	
			$nome_cliente=$cliente[$caixa][0];
			$saldo_inicial=$cliente[$caixa][1];
			$atualizando=0;

			if($tipo=="deposito")
			{
				$atualizando=$cliente[$caixa][1]+$reais;
			}else
			{
				$atualizando=$cliente[$caixa][1]-$reais;
			}
			$saldo_inicial=number_format($saldo_inicial,2,",",".");
			$atualizando=number_format($atualizando,2,",",".");

			echo "<p>Olá $nome_cliente,<br>
				  o numero da sua conta é: $caixa<br>
				  você fez o tipo de operação: $tipo, com o valor de R$ $reais<br> 
				  seu saldo inicial era de: R$ $saldo_inicial, foi atualizado para: R$ $atualizando</p>";
		}else
		{
			echo "<p>Desculpe a sua conta não existe no nosso sistema, tenta novamente</p>";
		}
	
 	} 
 	if($operacao=='2')
 	{
 		$maior=0;
 		foreach($cliente as $conta => $vetorInterno)
 		{

 			if ($vetorInterno[1]>$maior) 
 			{
 				$maior=$vetorInterno[1];
 				$maior_nome=$vetorInterno[0];
 				$maior_conta=$conta;
 			}
 			
 		}
 		$maior=number_format($maior,2,",",".");
 		echo "
 		<table>
 		<caption>Dados do cliente que tem o maior saldo</caption>
 		<tr>
 		<th>Saldo</th>
 		<th>Nome</th> 
 		<th>Conta</th>
 		</tr>

 		<tr>
 		<td>$maior</td>
 		<td>$maior_nome </td>
 		<td>$maior_conta</td>
 		</tr>
 		</table>";



 	}
 	if ($operacao=='3') {

 		$cliente["1010-X5"]=["Cleidiane da Rosa Eloy ", 1000.00 ]; //quem me dera ter esse saldo...
 		$cliente["1010-X6"]=["Bolsonaro Jair Messias",1000000000]; 

 		echo
		"<table>
 		<caption>matriz atualizada</caption>
 		<tr>
 		<th>Nome</th>
 		<th>Conta</th> 
 		<th>Saldo</th>
 		</tr>";
 		foreach ($cliente as $conta => $vetorInterno) {
 		$vetorInterno[1]=number_format($vetorInterno[1],2,",",".");
 		echo "<tr>
 		<td>$vetorInterno[0]</td>
 		<td>$conta </td>
 		<td>$vetorInterno[1]</td>
 		</tr>";
 		
 		}
 		echo "</table>";
 	}


}
?>
</body>
</html>